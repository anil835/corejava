package Programs;

public class SwapFirstAndLastWord {

	public static void main(String[] args) {
		String s="welcome to css ";
		String[]s1=s.split(" ");
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		String out= " ";
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
		
		

	}

}
