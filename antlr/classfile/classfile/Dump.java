import java.io.*;
import antlr.*;
import antlr.collections.*;

public class Dump {
	public static void main(String[] args) throws Exception {
		ClassfileParser parser = new ClassfileParser(
                                 new SimpleByteLexer(
                                 new BufferedInputStream(System.in)));

       	 	// start parsing at the classfile rule
	        parser.classfile();
	 	AST t = parser.getAST();
		System.out.println(t.toStringList());
	}
}
