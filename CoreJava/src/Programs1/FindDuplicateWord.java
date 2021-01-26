package Programs1;
//find duplicate word given string s="hi hero herro how r u how you you"//

import java.util.HashSet;

public class FindDuplicateWord {

	public static void main(String[] args)
	{
		String s="hi hero herro how r u how you you";
		
		String []str=s.split(" ");
		
		HashSet< String>set= new HashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		System.out.println(set);
		
		for (String word : set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			System.out.println(word +" "+ count);
		
			
		}

	}

}
