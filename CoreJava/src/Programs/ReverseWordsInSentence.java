package Programs;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		
		String s="hi how are you man";
		
		String str[]=s.split(" ");
		
		String rev=" ";
		
		for(int i=str.length-1;i>=0;i--)
		{
			rev= rev+" "+str[i];
		}
		System.out.println(rev);
		

	}

}
