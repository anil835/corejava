package Programs1;
//swap word//

public class Swap1Word {

	public static void main(String[] args)
	{
		String s="hi hello namaskaram elaundaru";
		
		String str[]= s.split(" ");
		
		String temp= str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		
		String out = " ";
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}

	}

}
