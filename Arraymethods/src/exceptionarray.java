import java.io.*;
public class exceptionarray {

	public static void main(String[] args)
    {
        int a = 5;
        int b = 0;
        try {
        	
        	System.out.println("Input two integers:\n"+a+"\n"+b);
        	int Z = a/b;

         // throw Exception
        	}
        catch (ArithmeticException e) {
        // Exception handler
        System.out.println(
            "Exception caught: Division by zero.");
    }
}
	
	


}
