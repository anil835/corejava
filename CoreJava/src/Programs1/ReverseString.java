package Programs1;
//Q) reverse the string String s="abc"  o/p="cba"//
public class ReverseString {

	public static void main(String[] args) 
	{
		String s="abc";
		String rev = " ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		

	}

}
