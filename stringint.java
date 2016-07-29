import java.util.Scanner;


public class stringint {
	public static void main(String arg[]){
		try{
	
		String s1;
		Scanner ff=new Scanner(System.in);
		s1=ff.next();
		//int a=Integer.parseInt(s1);
		float f=Float.parseFloat(s1);
		System.out.println("true");
		}
	catch(Exception e){
		System.out.println("false");
	}
	
	}
}
