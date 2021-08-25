
import java.util.Scanner;

public class EqualValues {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter the first value: ");
		Integer first_num=scan.nextInt();
	
		
		System.out.println("Please enter the second value: ");
		Integer sec_num=scan.nextInt();
		

		if(first_num.equals(sec_num)) {
			
			System.out.println(first_num+ "equals to"+ sec_num+ " :"+first_num.equals(sec_num));
			System.out.println("Are equals");
			
		}else {
			System.out.println("Not equals");
			System.out.println(first_num+ " equals to "+ sec_num+ " is:"+first_num.equals(sec_num));
		}
		
	}

}
