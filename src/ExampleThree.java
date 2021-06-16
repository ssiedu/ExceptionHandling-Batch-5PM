
public class ExampleThree {
	public static void main(String[] args) {
		System.out.println("Begining-of-Program...!");
		int x=0,y=0,z=0;
		try {
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			z=x/y;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Insufficient Values (Min 2 Numbers Required)...!");
		}catch(NumberFormatException e) {
			System.out.println("Only Numbers Are Allowed...!");
		}catch(ArithmeticException e) {
			z=x/2;
		}
		
		
		
		System.out.println("Result : "+z);
		System.out.println("End-of-Program...!");

	}
}
