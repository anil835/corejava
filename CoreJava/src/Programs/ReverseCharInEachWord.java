package Programs;

public class ReverseCharInEachWord
{
	public static void main(String[] args) {
		String s="Hello Every One Im Audible";
		//place each word in array index//
		
		String[] str =s.split(" ");
		
		//read each word from array//
		
		for(int i=0;i<str.length;i++)
		{
			String s2 =str[i];
			
			//reverse each char of word//
			for(int j=s2.length()-1;j>=0;j--)
			{
				System.out.print(s2.charAt(j));
				
			}
			System.out.print(" ");
		}
		
				
	}

}
