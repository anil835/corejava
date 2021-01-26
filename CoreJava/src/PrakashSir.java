
public class PrakashSir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s="welocme to home";
	
	String str[]=s.split(" ");
	
	String temp=str[0];
	str[0]=str[str.length-1];
	str[str.length-1]=temp;
	String out=" ";
	
	for (int i=0;i<str.length;i++)
	{
		System.out.println(str[i]);
	}
		
		
	

	}

}
