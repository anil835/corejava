package com;

public class Reverseword {
	public static void main(String[] args) {
		String s="welcome to my world";
		String[] str =s.split(" ");
		String rev= " ";
		String rev1=" ";
		
		for(int i=str.length-1;i>=0;i--)
		{
			rev=rev+str[i]+" ";
		}
		System.out.println(rev);
		String given1="welcome to tyss";
		String s2[]=given1.split(" t ");
		for(int i=s2.length-1;i>=0;i--)
		{
			rev1=rev1+str[i]+" ";
		}
		System.out.println(rev);
	}

}
