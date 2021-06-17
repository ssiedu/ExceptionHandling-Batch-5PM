
public class ExampleThree {
	static String s;
	
	public static void main(String[] args) {
		System.out.println("Begining-of-Program...!");
		int x=0,y=0,z=0;
		try {
			s.toUpperCase();
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			z=x/y;
		}catch(NumberFormatException e) {
			System.out.println("Only Numbers Are Allowed...!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Insufficient Values (Min 2 Numbers Required)...!");
		}catch(ArithmeticException e) {
			z=x/2;
		}catch(Exception e) {
			System.out.println("Unknown Problem...!");
		}
		
		
		
		System.out.println("Result : "+z);
		System.out.println("End-of-Program...!");

	}
}
