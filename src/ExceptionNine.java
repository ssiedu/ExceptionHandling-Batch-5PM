import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionNine {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InterruptedException {
		
		//here we are trying to 2nd element of command line args
		System.out.println(args[1]);	//ArrayIndexOutOfBoundsException
		
		FileReader fr=new FileReader("abc.txt");
		
		Class.forName("abcd");
		
		Thread.sleep(2000);
		
		/*
		//here we are trying to open a file named abc.txt
		try {
			FileReader fr=new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println("This File Is Not Available On Disk...!");
		}	
		*/
		

	}

}
