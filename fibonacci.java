import java.util.Scanner;


public class fibonacci {
	public static void main(String [ ] arg) {
		int a=0,b=1;
		int n,c;
		Scanner name=new Scanner(System.in);
		System.out.println("enter the fibonacci element");
		n=name.nextInt();
		
		for( int i=2;i<n;++i)
		{
		c=a+b;
		
			a=b;
			b=c;
		}
		System.out.println(b);

	}
}
