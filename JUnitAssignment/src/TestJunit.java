import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestJunit {

	String message= "Hello World";
	String string1="Shuruq";                    
    String string2="Shuruq";                    
    String string3="Amsha";                    
    String string4="Waad"; 
    String d1=null;
    int var=1;
    int var2=2;
    String failmessage="There is an error";

	
	MessageUtil messageUtil= new MessageUtil(message);
	




	
	@Test
	public void testPrintMessage() {
		// TODO Auto-generated method stub
		assertEquals(message,messageUtil.printMessage());
		assertEquals(string3,string4);
		assertSame(string1, string3);
		assertEquals(string1, string2);
		assertTrue(string1,string2);
		assertTrue(string1,string3);
		assertNull(d1);
		

	}





	private void Fail(String message2) {
		// TODO Auto-generated method stub
		
	}





	private void assertTrue(String string12, String string22) {
		// TODO Auto-generated method stub
		
	}

}
