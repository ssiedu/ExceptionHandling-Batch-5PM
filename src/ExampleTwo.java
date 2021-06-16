
public class ExampleTwo {

	public static void main(String[] args) {
		System.out.println("Begining-of-Program...!");
		int x=0,y=0,z=0;
		try {
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			z=x/y;
		}catch(Exception e) {
			System.out.println("Something Wrong In try....!");
		}
		System.out.println("Result : "+z);
		System.out.println("End-of-Program...!");

	}

}
