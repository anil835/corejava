package Programs;

import java.util.HashSet;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class countduplicatechar {

	public static void main(String[] args) {
		String s="welcome world";
		int count1=0;
		HashSet<Character>set=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		System.out.println(set);
		for (Character cha : set) 
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(cha==s.charAt(i))
				{
					count++;
				}
				
			}
			if(count>1)
			{
				count1++;
			}
		}
		System.out.println(count1);
	}
}
