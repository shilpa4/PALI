

	import java.util.Scanner;


	public class pyramid {
		public static void main(String [ ] arg){
			int n,flag=0;
			int tmp=0,temp=0;
			Scanner pyr = new Scanner(System.in);
			n=pyr.nextInt();
			
		for(int i=0;i<n;i++)
		{
			tmp=temp;
			flag++;
			for(int a=0;a<n-i-1;a++)
			{
				System.out.print("  ");
			}
				for(int j=0;j<flag;j++)
				{
					
					if(j<=flag/2)
					{
						tmp++;
						if(tmp==10)
						{
							tmp=0;
						}
					
					System.out.print((tmp)+" ");
					if(j==(flag/2))
					{
						temp=tmp;
					}
					}	
					else{
						tmp--;
						if(tmp<0)
						{
							tmp=9;
						}
						System.out.print((tmp)+" ");
						
						
					}
					
						
				
			
		}
		System.out.println();
		flag++;
		}

	}
	}


