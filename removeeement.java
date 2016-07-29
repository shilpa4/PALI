import java.util.Scanner;


public class removeeement {
public static void main(String arg[]){
	int a[]=new int[5];
	int b[]=new int[5];
Scanner ff=new Scanner(System.in);
for(int i=0;i<5;i++){
	a[i]=ff.nextInt();
}
int element,out;
element=ff.nextInt();
for(int j=0;j<5;j++){
	if(a[j]!=element){
		b[j]=a[j];
		System.out.println(b[j]);
	}
}
}
}
