package Programs1;
//count duplicate char in given string//

import java.util.HashSet;

public class CountDuplicateCharInString {

	public static void main(String[] args) {
		String s="welcome hello";
		int count1=0;
		HashSet<Character>set= new HashSet<Character>();
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
			if(count>1)
			{
				System.out.println(single +" "+count);
			}
		}

	}

}
