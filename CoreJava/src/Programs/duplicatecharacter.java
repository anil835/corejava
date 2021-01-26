package Programs;

import java.util.HashSet;

public class duplicatecharacter {

	public static void main(String[] args) {
		String s="welcome well";
		HashSet<Character>set=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
		
		for (Character cha : set) {
			int count=0;
			
			for(int i=0;i<s.length();i++)
			{
				
				if(cha==s.charAt(i))
				{
					count++;
				}
				
			}
			
			if(count>1)
				System.out.println(cha+" "+count);
		}
			
			
		}
	}


