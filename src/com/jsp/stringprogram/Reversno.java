package com.jsp.stringprogram;

public class Reversno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sredipsj";
		String s1= rev(s);
		System.out.println(s1);
	}
  public static String rev(String s)
{
  String temp="";
   for(int i=s.length()-1;i>=0;i--)
{
	char ch=s.charAt(i);
	temp+=ch;
}
	return temp;
	}


}


