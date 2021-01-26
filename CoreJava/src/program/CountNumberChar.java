package program;

import java.util.HashSet;

public class CountNumberChar {

	public static void main(String[] args) {
		String s="hi hello how are you";
		int count1=0;
		HashSet<Character>set=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
		
		for (Character character : set) {
			int count=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(character==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
			   System.out.println(character + " "+ count);
			}
			
		}
		System.out.println(count1);
	}

}
