package Programs1;

import java.util.HashSet;

//find duplicate char in given string s="abcaxyz"
public class FindDuplicateChar {

	public static void main(String[] args) {
		String s="axbcaxxyz";
		HashSet<Character>set=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
		
		for (Character single : set) 
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(single==s.charAt(i))
				{
					count++;
				}
			}
		  System.out.println(single+ " "+count);
			
		}
		

	}

}
