package Programs;

import java.util.HashSet;

public class EachAccuranceWord {

	public static void main(String[] args) {
		String s="hii how are you hii you ";
		String str[]=s.split(" ");
		
		HashSet<String>set=new HashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		System.out.println(set);
		
		for (String string : set) {
			
			int count=0;
			
			for(int i =0;i<str.length;i++)
			{
				if(string.equals(str[i]))
				{
					count++;
				}
			}
			System.out.println(string+" "+count);
			
		}
	}

}
