import compilation.ErrorListener;
import compilation.TreeListener;
import compilation.TreeTraverser;
import org.antlr.v4.runtime.CharStreams;

import org.antlr.v4.runtime.CommonTokenStream;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.*;
import java.util.HashSet;

import mylang.*;

public class Main {
    public static void main(String[] args){
        try {
            ClassWriter cw = createClass(args[0]);
            File classFile = new File("Compiler.class");
            BufferedOutputStream w = new BufferedOutputStream(new FileOutputStream(classFile));
            byte[] data = cw.toByteArray();
            w.write(data, 0, data.length);
            w.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ClassWriter createClass(String input) throws IOException {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(
                52,
                Opcodes.ACC_PUBLIC +Opcodes.ACC_SUPER,
                "Compiler",
                null,
                "java/lang/Object",
                null
        );

        MethodVisitor mv = cw.visitMethod(
                Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
                "main",
                "([Ljava/lang/String;)V",
                null,
                null
        );


        org.antlr.v4.runtime.CharStream cs = CharStreams.fromFileName(input);
        myLangLexer lexer = new myLangLexer(cs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        myLangParser parser = new myLangParser(tokenStream);
        TreeListener treeListener = new TreeListener(mv, cw);
        ErrorListener errorListener = new ErrorListener();

        parser.addParseListener(treeListener);
        parser.addErrorListener(errorListener);

        parser.program();

        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(255, 255);
        mv.visitEnd();

        cw.visitEnd();

        //TODO: ARITHMETIC OPERATIONS

        return cw;
    }
}
