package com.jsp.stringprogram;

public class A {

	public static void main(String[] args) {
	
		String s="abCDFgH";
		String t="";
		for(int i=0;i<s.length();i++)
		{
			//int i=0;
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
				t+=(char)(ch+32);
				else if(ch>='a'&&ch<='z')
				t+=(char)(ch-32);
				else 
					t+=ch;
		}
		System.out.println(t);
		}

	}


