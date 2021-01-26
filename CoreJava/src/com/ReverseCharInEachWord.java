package com;

public class ReverseCharInEachWord
{
	public static void main(String[] args) {
		String s ="welcome to my world";
		
		//place each world into array index
		String[] str=s.split(" ");
		
		//to read each word from array
		for(int i=0;i<str.length;i++)
		{
			String s2=str[i]+" ";
			
			//to reverse each char of word
			for(int j=s2.length()-1;j>=0;j--)
			{
				System.out.print(s2.charAt(j));
			}
			
		}
		System.out.print(" ");
				
	}
	

}
