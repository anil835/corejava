package Programs;

public class Findalphanumsplchar {

	public static void main(String[] args) {
		String s="Abc12@#$%anil256";
		String alpha=" ";
		String spl=" ";
		String num=" ";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else
			{
				spl=spl+s.charAt(i);
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spl);


	}

}
