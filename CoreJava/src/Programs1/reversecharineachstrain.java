package Programs1;
//reverse char in each word in the given string//

public class reversecharineachstrain {

	public static void main(String[] args) {
		String s="world greatest lover";
		String[]str=s.split(" ");
		String rev=" ";
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
