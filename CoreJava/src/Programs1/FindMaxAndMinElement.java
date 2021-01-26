package Programs1;

public class FindMaxAndMinElement {

	public static void main(String[] args) {
		
		int ch[]= {20,30,40,50,60,1};
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]>=ch[j])
				{
					int temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		
		
		System.out.println(ch[0]);
		System.out.println(ch[ch.length-1]);

	}

}
