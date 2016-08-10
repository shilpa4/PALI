import java.util.ArrayList;
import java.util.Scanner;


public class arraymap {
public static void main(String arg[]){
	int a[]=new int[5];
	ArrayList<Integer> s=new ArrayList();
	ArrayList<Integer> p=new ArrayList();

	int size=0;
	int k=0,l=0,m=0;
	Scanner ff=new Scanner(System.in);
	System.out.println("the given array is ");
	for(int i=0;i<5;i++){
		a[i]=ff.nextInt();
	}
	
	for(int j=1;j<5;j++){
		
		if(a[0]==a[j]){
		size=j;
		m++;
	}
	}
	m=0;
	for(int q=0;q<size;q++){
s.add(a[q]);
	}
	if(size==0){
		System.out.println("not possible");
	}
	else{
	for(int w=size;w<5;w++){
p.add(a[w]);
	
	}
	System.out.println(s);
	System.out.println(p);

}
}
}