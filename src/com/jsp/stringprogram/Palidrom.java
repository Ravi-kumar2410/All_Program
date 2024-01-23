package com.jsp.stringprogram;

public class Palidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("palidrom");
			
		}
		else
		{
			System.out.println(" not palidrom");	
		}

	}

}
