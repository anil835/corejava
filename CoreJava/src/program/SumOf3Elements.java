package program;

public class SumOf3Elements {

	public static void main(String[] args)
	{
		int ch[]= {20,30,40,50,5,1,89};
		int sum=0;
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]<=ch[j])
				{
					int temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			//System.out.println(ch[i]);
			sum=sum+ch[i];
		}
		System.out.println(sum);
		

	}

}
