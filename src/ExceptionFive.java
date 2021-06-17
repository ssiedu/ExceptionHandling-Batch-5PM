import java.util.Scanner;

public class ExceptionFive {

	public static void main(String[] args) {
		int n1=0,n2=0,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		n1=sc.nextInt();
		System.out.println("Enter Second Number : ");
		n2=sc.nextInt();
		try {
			res=n1/n2;
		}catch(ArithmeticException e) {
			System.out.println("Second No Cant Be Zero..!");
			System.out.println("Please Enter Second Number Again...!");
			n2=sc.nextInt();
			try {
				res=n1/n2;
			}catch(ArithmeticException e1) {
				System.out.println("Again Zero..!");
				res=n1/2;
			}
		}
		
		System.out.println("Result  : "+res);
		System.out.println("End of Program..!");

	}

}
