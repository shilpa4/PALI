import java.util.Scanner;


public class sumpali {
public static void main(String ard[]){
	int n;
	Scanner ff=new Scanner(System.in);
	n=ff.nextInt();
	int tmp=n;
	int sum=0;
	while(tmp!=0){
		int a=tmp%10;
		sum=sum+a;
		tmp=tmp/10;
	}
	System.out.println("the sum number"+sum);
	String s1=String.valueOf(sum);
	System.out.println(s1);
	  StringBuffer fa=new StringBuffer(s1);
		 fa.reverse();
		 String rr=new String(fa);

		    System.out.println(rr);
	if(rr.equals(s1)){
		System.out.println("palindrome");
	}
	else{
		System.out.println("not palindrome");
	}
}
}