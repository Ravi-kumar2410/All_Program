package com.jsp.stringprogram;

public class DigitToLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ra25vi65";
		String s1="",s2="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			s1=s1+ch;
			else
				s2=s2+ch;
			
		}
		String c=s1+s2;
		System.out.println(c);
		

	}

}
