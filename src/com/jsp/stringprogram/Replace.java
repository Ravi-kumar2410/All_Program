package com.jsp.stringprogram;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ramaana";
		char a='a';
		String b="";
		char[]ch=s.toCharArray();
		for(int p=0;p<ch.length;p++)
		{
			if(ch[p]==a)
			{
				ch[p]='#';
			}
			b+=ch[p];
		}
		System.out.println(b);

	}

}
