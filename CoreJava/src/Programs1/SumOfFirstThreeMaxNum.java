package Programs1;

public class SumOfFirstThreeMaxNum {

	public static void main(String[] args)
	{
		int ch[]= {20,30,20,50,5,1};
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>=ch[j])
				{
					int temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			
		}
		
		//for(int i=0;i<3;i++)
		//{
		//	sum=sum+ch[i];
		//}
		//System.out.println(sum);
		
		for(int i=0;i>3;i++)
		{
			sum=sum+ch[i];
			
			
		}
		System.out.println(sum);
		//System.out.println(ch[0]);
		//System.out.println(ch[ch.length-1]);
		
	}

}
