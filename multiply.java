import java.util.Scanner;


public class multiply {
public static void main(String arg[]){
	int n;
	Scanner ff=new Scanner(System.in);
	n=ff.nextInt();
	int sum=1,tmp,a;
	tmp=n;
	while(tmp!=0){
		a=tmp%10;
		sum=sum*a;
		tmp=tmp/10;
	}
int	output=sum*n;
	System.out.println(output);
}
}
