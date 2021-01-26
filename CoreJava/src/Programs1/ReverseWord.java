package Programs1;
//Q)reverse words in sentence//

public class ReverseWord {

	public static void main(String[] args) {
		
		String s="hello world lets confident ";
		
		String[] str= s.split(" ");
		String rev = " ";
		
		for(int i=str.length-1;i>=0;i--)
		{
			rev= rev+str[i]+ " ";
		}
		System.out.println(rev);
	}

}
