package program;

import java.util.HashSet;

public class FindNumberAccurenceChar {

	public static void main(String[] args) {
		String s="welcome to world";
		HashSet< Character>set=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
		
		for (Character carecter : set) {
			
			int count=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(carecter==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(carecter +" " + count);
			
		}

	}

}
