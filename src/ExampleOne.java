import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {

		String cities[]= {"indore","bhopal","delhi","chennai"};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The City Number You Wish To See....");
		int n=sc.nextInt();
		
		try {
			System.out.println("City Available On Given Number : "+n+" : "+cities[n]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Number You Provided Is Not Available ...! ");
		}
		System.out.println("End Of Program...!");
		
	}

}
