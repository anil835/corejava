package Programs;

import java.util.HashSet;

public class FindNumberOfAccurence {

	public static void main(String[] args)
	{
		String s="welcome well ";
		
		HashSet<Character>set=new HashSet<Character>();//allow only unique data
		
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
			System.out.println(character+" "+count);
		}
		
		
	}
	

}
