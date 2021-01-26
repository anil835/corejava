package Programs;

public class FindMaxElement {
	
	public static void main(String[] args) {
		int ch[]= {20,30,40,10,60,5};
		//int sum=0;
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
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
			//sum=sum+ch[i];
		}
	    System.out.println(ch[0]);
		System.out.println(ch[ch.length-1]);
		//System.out.println(sum);
	}

}
