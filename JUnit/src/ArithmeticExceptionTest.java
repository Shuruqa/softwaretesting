import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArithmeticExceptionTest {
	
	String st = "Tester"; 
	ArithmeticExceptionex messageUtil = new ArithmeticExceptionex(st);
	
	@Test(expected = Exception.class)
	public void PrintArithmeticExceptionTest() {

		System.out.println("Inside testPrintMessage()");     
	      messageUtil.printMessage(); 
	}
	@Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      st = "Hi!" + "Tester";
	      assertEquals(st,messageUtil.salutationMessage());
	   }
	 
	/*For arithmetic exception*/
	
	@Test(expected=ArithmeticException.class)
	public void dividedByZeroExample1(){
		int e = 1/0;
	}

	
	@Test
	public void dividedByZeroExample2(){
		int e = 1/0;
	}

}
