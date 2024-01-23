package com.jsp.stringprogram;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		String s1="bcd";
		String t=" ";
		char[]ch1=s.toCharArray();
		char[]ch2=s1.toCharArray();
		for(int i=0;i<ch2.length;i++)
		{
		 t=t+ ch1[i]+ch2[i];
		}
		System.out.println(t);

	}

}
