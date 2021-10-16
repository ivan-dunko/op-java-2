package compilation;

import com.sun.org.apache.bcel.internal.generic.BIPUSH;
import mylang.myLangBaseListener;
import mylang.myLangParser;

import java.util.HashMap;
import java.util.LinkedList;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class TreeListener extends myLangBaseListener {
    enum DataType{
        INT,
        STRING
    };

    class VariableRedeclarationException extends RuntimeException{
        VariableRedeclarationException(String varName){
            super(varName);
        }
    }

    class UndeclaredVariableException extends RuntimeException{
        UndeclaredVariableException(String varName){
            super(varName);
        }
    }

    class UndeclaredLabelException extends RuntimeException{
        UndeclaredLabelException(String labelName){
            super(labelName);
        }
    }

    private final MethodVisitor mv;
    private final ClassWriter cw;
    private HashMap<String, DataType> decVars;
    private HashMap<String, Integer> varId;
    private HashMap<String, Integer> intVars;
    private HashMap<String, String> stringVars;
    private HashMap<String, Label> labels;
    private LinkedList<Label> trueLabels, falseLabels, flows;
    private int varCnt = 0;

    public TreeListener(MethodVisitor mv, ClassWriter cw){
        this.mv = mv;
        this.cw = cw;
        decVars = new HashMap<>();
        varId = new HashMap<>();
        intVars = new HashMap<>();
        stringVars = new HashMap<>();
        labels = new HashMap<>();
        trueLabels = new LinkedList<>();
        falseLabels = new LinkedList<>();
        flows = new LinkedList<>();
    }

    private boolean isDeclared(String varName){
        return decVars.get(varName) != null;
    }

    private boolean isLabelDeclared(String name){
        return  labels.get(name) != null;
    }

    @Override
    public void enterProgram(myLangParser.ProgramContext ctx){

    }

    @Override
    public void enterVarDec(myLangParser.VarDecContext ctx) {
        //variables.add(ctx.VarName().getText());
    }

    @Override
    public void exitVarDec(myLangParser.VarDecContext ctx) {
        String varName = ctx.VarName().getSymbol().getText();
        if (isDeclared(varName)){
            throw new VariableRedeclarationException(varName);
        }

        if (ctx.type().Int() != null){
            decVars.put(varName, DataType.INT);
            intVars.put(varName, 0);
        }
        else{
            decVars.put(varName, DataType.STRING);
            stringVars.put(varName, "");
        }

        varId.put(varName, varCnt++);
    }

    @Override
    public void exitIntDef(myLangParser.IntDefContext ctx) {
        String varName = ctx.VarName(0).getSymbol().getText();
        if (isDeclared(varName))
            throw new VariableRedeclarationException(varName);

        decVars.put(varName, DataType.INT);
        intVars.put(varName, 0);
        varId.put(varName, varCnt++);
        int id = varCnt - 1;

        // const assignment
        if (ctx.VarName(1) == null){
            int val = Integer.parseInt(ctx.Number().getText());
            byte bVal = (byte)val;
            short sVal = (short)val;
            if (val == (int)bVal){
                mv.visitIntInsn(Opcodes.BIPUSH, val);
                mv.visitVarInsn(Opcodes.ISTORE, id);
            }
            else if (val == (int)sVal){
                mv.visitIntInsn(Opcodes.SIPUSH, val);
                mv.visitVarInsn(Opcodes.ISTORE, id);
            }
            else{
                //int cId = cw.newConst(val);
                mv.visitLdcInsn(val);
                mv.visitVarInsn(Opcodes.ISTORE, id);
            }
        }
        else{
            String anVarName = ctx.VarName(1).getText();
            if (!isDeclared(anVarName))
                throw new UndeclaredVariableException(anVarName);

            int anId = varId.get(anVarName);
            mv.visitVarInsn(Opcodes.ILOAD, anId);
            mv.visitIntInsn(Opcodes.ISTORE, id);
        }
    }

    @Override
    public void exitStringDef(myLangParser.StringDefContext ctx) {
        String varName = ctx.VarName(0).getSymbol().getText();
        if (isDeclared(varName))
            throw new VariableRedeclarationException(varName);

        varId.put(varName, varCnt++);
        decVars.put(varName, DataType.STRING);
        stringVars.put(varName, "");
        int id = varCnt - 1;

        // const assignment
        if (ctx.VarName(1) == null){
            String str = clearQuotes(ctx.StringValue().getText());
            //int sId = cw.newConst(str);
            mv.visitLdcInsn(str);
            mv.visitVarInsn(Opcodes.ASTORE, id);
        }
        else{
            String anVarName = ctx.VarName(1).getText();
            if (!isDeclared(anVarName))
                throw new UndeclaredVariableException(anVarName);

            int anId = varId.get(anVarName);
            mv.visitVarInsn(Opcodes.ALOAD, anId);
            mv.visitIntInsn(Opcodes.ASTORE, id);
        }
    }

    @Override
    public void exitPrint(myLangParser.PrintContext ctx) {
        mv.visitFieldInsn(
                Opcodes.GETSTATIC,
                "java/lang/System",
                "out",
                "Ljava/io/PrintStream;");

        if (ctx.Number() != null){
            mv.visitLdcInsn(Integer.parseInt(ctx.Number().getText()));
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
        }
        else if (ctx.StringValue() != null){
            mv.visitLdcInsn(clearQuotes(ctx.StringValue().getText()));
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        }
        else{
            String varName = ctx.VarName().getText();
            if (!isDeclared(varName))
                throw new UndeclaredVariableException(varName);

            int id = varId.get(varName);
            if (decVars.get(varName) == DataType.INT){
                mv.visitVarInsn(Opcodes.ILOAD, id);
                mv.visitMethodInsn(
                        Opcodes.INVOKEVIRTUAL,
                        "java/io/PrintStream",
                        "println",
                        "(I)V",
                        false);
            }
            else{
                mv.visitVarInsn(Opcodes.ALOAD, id);
                mv.visitMethodInsn(
                        Opcodes.INVOKEVIRTUAL,
                        "java/io/PrintStream",
                        "println",
                        "(Ljava/lang/String;)V",
                        false);
            }
        }
    }

    @Override
    public void exitStringAssign(myLangParser.StringAssignContext ctx) {
        String varName = ctx.VarName(0).getText();
        if (!isDeclared(varName))
            throw new UndeclaredVariableException(varName);

        int id = varId.get(varName);

        // const assignment
        if (ctx.VarName(1) == null){
            String str = clearQuotes(ctx.StringValue().getText());
            //int sId = cw.newConst(str);
            mv.visitLdcInsn(str);
            mv.visitVarInsn(Opcodes.ASTORE, id);
        }
        else{
            String anVarName = ctx.VarName(1).getText();
            if (!isDeclared(anVarName))
                throw new UndeclaredVariableException(anVarName);

            int anId = varId.get(anVarName);
            mv.visitVarInsn(Opcodes.ALOAD, anId);
            mv.visitIntInsn(Opcodes.ASTORE, id);
        }
    }

    @Override
    public void exitIntAssign(myLangParser.IntAssignContext ctx) {
        String varName = ctx.VarName(0).getText();
        if (!isDeclared(varName))
            throw new UndeclaredVariableException(varName);

        int id = varId.get(varName);
        // const assignment
        if (ctx.VarName(1) == null){
            int val = Integer.parseInt(ctx.Number().getText());
            byte bVal = (byte)val;
            short sVal = (short)val;
            if (val == (int)bVal){
                mv.visitIntInsn(Opcodes.BIPUSH, val);
                mv.visitVarInsn(Opcodes.ISTORE, id);
            }
            else if (val == (int)sVal){
                mv.visitIntInsn(Opcodes.SIPUSH, val);
                mv.visitVarInsn(Opcodes.ISTORE, id);
            }
            else{
                //int cId = cw.newConst(val);
                mv.visitLdcInsn(val);
                mv.visitVarInsn(Opcodes.ISTORE, id);
            }
        }
        else{
            String anVarName = ctx.VarName(1).getText();
            if (!isDeclared(anVarName))
                throw new UndeclaredVariableException(anVarName);

            int anId = varId.get(anVarName);
            mv.visitVarInsn(Opcodes.ILOAD, anId);
            mv.visitIntInsn(Opcodes.ISTORE, id);
        }
    }

    @Override
    public void exitLabel(myLangParser.LabelContext ctx) {
        String labelName = ctx.VarName().getText();

        Label label = labels.get(labelName);
        if (label != null)
            mv.visitLabel(label);
        else{
            label = new Label();
            labels.put(labelName, label);
            mv.visitLabel(label);
        }

        //labels.put(labelName, label);
    }

    @Override
    public void exitGotoOp(myLangParser.GotoOpContext ctx) {
        String name = ctx.VarName().getText();

        Label label = labels.get(name);
        if (label == null){
            label = new Label();
            labels.put(name, label);
        }

        mv.visitJumpInsn(Opcodes.GOTO, label);
    }

    @Override
    public void exitIfStatement(myLangParser.IfStatementContext ctx) {
        Label l = flows.pollLast();
        mv.visitLabel(l);
    }

    @Override
    public void exitCondition(myLangParser.ConditionContext ctx) {

    }

    @Override
    public void exitMoreInt(myLangParser.MoreIntContext ctx) {
        if (ctx.intVal(0).VarName() != null){
            String varName1 = ctx.intVal(0).VarName().getText();
            if (!isDeclared(varName1))
                throw new UndeclaredVariableException(varName1);

            int id = varId.get(varName1);
            mv.visitVarInsn(Opcodes.ILOAD, id);
        }
        else{
            mv.visitLdcInsn(Integer.parseInt(ctx.intVal(0).Number().getText()));
        }

        if (ctx.intVal(1).VarName() != null){
            String varName1 = ctx.intVal(1).VarName().getText();
            if (!isDeclared(varName1))
                throw new UndeclaredVariableException(varName1);

            int id = varId.get(varName1);
            mv.visitVarInsn(Opcodes.ILOAD, id);
        }
        else{
            mv.visitLdcInsn(Integer.parseInt(ctx.intVal(1).Number().getText()));
        }

        Label l = new Label();

        Object notRef = ctx.parent instanceof myLangParser.ConditionContext ?
                ((myLangParser.ConditionContext) ctx.parent).Not() :
                ((myLangParser.LoopContext) ctx.parent).Not();

        if (notRef == null)
            mv.visitJumpInsn(Opcodes.IF_ICMPLE, l);
        else
            mv.visitJumpInsn(Opcodes.IF_ICMPGT, l);

        flows.add(l);
    }

    @Override
    public void exitMoreString(myLangParser.MoreStringContext ctx) {
        if (ctx.stringVal(0).VarName() != null){
            String varName = ctx.stringVal(0).VarName().getText();
            if (!isDeclared(varName))
                throw new UndeclaredVariableException(varName);

            int id = varId.get(varName);
            mv.visitVarInsn(Opcodes.ALOAD, id);
        }
        else{
            mv.visitLdcInsn(clearQuotes(ctx.stringVal(0).StringValue().getText()));
        }

        if (ctx.stringVal(1).VarName() != null){
            String varName = ctx.stringVal(1).VarName().getText();
            if (!isDeclared(varName))
                throw new UndeclaredVariableException(varName);

            int id = varId.get(varName);
            mv.visitVarInsn(Opcodes.ALOAD, id);
        }
        else{
            mv.visitLdcInsn(clearQuotes(ctx.stringVal(1).StringValue().getText()));
        }

        mv.visitMethodInsn(
                Opcodes.INVOKEVIRTUAL,
                "java/lang/String",
                "compareTo",
                "(Ljava/lang/String;)I",
                false);

        Label l = new Label();
        mv.visitLdcInsn(0);
        myLangParser.ConditionContext c = (myLangParser.ConditionContext)ctx.parent;

        if (c.Not() == null)
            mv.visitJumpInsn(Opcodes.IF_ICMPLE, l);
        else
            mv.visitJumpInsn(Opcodes.IF_ICMPGT, l);
        flows.add(l);
    }

    @Override
    public void enterLoop(myLangParser.LoopContext ctx) {
        Label l = new Label();
        mv.visitLabel(l);
        flows.add(l);
    }

    @Override
    public void exitLoop(myLangParser.LoopContext ctx) {
        Label l = flows.pollLast();
        mv.visitLabel(l);
    }

    @Override
    public void exitBlock(myLangParser.BlockContext ctx) {
        if (ctx.parent instanceof myLangParser.LoopContext){
            Label ifLabel = flows.pollLast();
            Label loopLabel = flows.pollLast();

            //mv.visitLabel(loopLabel);
            mv.visitJumpInsn(Opcodes.GOTO, loopLabel);
            flows.add(ifLabel);
        }
    }

    @Override
    public void exitInc(myLangParser.IncContext ctx) {
        String varName = ctx.VarName().getText();
        if (!isDeclared(varName))
            throw new UndeclaredVariableException(varName);

        int id = varId.get(varName);
        mv.visitIincInsn(id, 1);
    }

    private static String clearQuotes(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.delete(0, 1);
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
