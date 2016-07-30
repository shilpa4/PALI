
public class demoencrypt {
	public static void main(String arg[]){
	String word = "java";
	int dd=0;
int arr[]=new int[word.length()];
	for(int i =0;i<word.length();++i)
	{

	if(Character.isLowerCase(word.charAt(i))){
	arr[dd]=((int)word.charAt(i) -(int)'a'+1);
	System.out.println(arr[dd]);
	dd++;
	}
	else{
	arr[dd]=((int)word.charAt(i)-(int)'A' +1);
	System.out.println(arr[dd]);
	dd++;
	}
	}
	int en=arr[word.length()-1];
	System.out.println("the encrypt num is "+arr[word.length()-1]);
	int brr[]=new int[word.length()-1];
for(int j=0;j<word.length()-1;j++){
	brr[j]=arr[j]-en;
	if(brr[j]<=0){
		brr[j]=brr[j]+26;
	}
	System.out.println("brr[] "+brr[j]);
}
//for(int y=0;y<word.length()-1;y++){
//if(arr[y]==arr[y].toUpperCase()){	

char arr1[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
for(int k=0;k<word.length()-1;k++){
System.out.print(arr1[brr[k]-1]);
}
System.out.println(arr1[arr[word.length()-1]-1]);
}
}