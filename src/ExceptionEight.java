import java.util.Scanner;

class BigNumberException extends Exception {
	
}

public class ExceptionEight {

	public static void main(String[] args) {
		int n1=0,n2=0,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		n1=sc.nextInt();
		System.out.println("Enter Second Number : ");
		n2=sc.nextInt();
		try {
			
			if(n2>n1) {
				//we are raising an BigNumberException
				BigNumberException ob=new BigNumberException();
				throw ob;
			}
			res=n1/n2;
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException Handled...!");
			res=n1/2;
		}catch(BigNumberException e) {
			System.out.println("BigNumberException Handled...!");
			System.out.println("Cant Divide A Small Number By Larger One..!");
		}
		
		System.out.println("Result  : "+res);
		System.out.println("End of Program..!");

	}

}
