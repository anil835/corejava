package Programs1;
//count duplicate word in given string//

import java.util.HashSet;

public class FindDuplicateWordInString {

	public static void main(String[] args) {
		String s="hi hello hello namaskara hello bye then bye hi";
		
		String str[]= s.split(" ");
		int count1=0;
		
		HashSet<String>set= new HashSet<String>();
		
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
			if(count>1)
			{
				System.out.println(word +" "+count); 
				//count1++;
			}
			
		}
		//System.out.println(count1);

	}

}
