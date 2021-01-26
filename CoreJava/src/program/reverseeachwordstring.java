package program;

public class reverseeachwordstring {

	public static void main(String[] args) {
		String s="hi hello world";
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			String str2=str[i];
			
			for(int j=str2.length()-1;j>=0;j--)
			{
				System.out.print(str2.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
