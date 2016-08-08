import java.util.Scanner;


public class powerof4 {
	public static void main(String [ ] arg){
	int n;
	Scanner ff=new Scanner(System.in);
	n=ff.nextInt();
	int b,c,sum=0;
	while(n!=0){
		b=n%10;
		c=b*b*b*b;
		sum=sum+c;
		n=n/10;
	}
	System.out.println(sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
