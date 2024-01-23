package com.jsp.stringprogram;

public class Counts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is easy";
		//char a='a';
		int i=0;
		int count=0;
		char []ch=s.toCharArray();
		//String []temp=s.split(" ");
		for(int p=0;p<ch.length;p++)
		{
			if(ch[p]!=' ') {
				count++;
			}
			if (ch[p]!=' ')
				System.out.println(count);
		}
		if (ch[i]==' ')
			System.out.println(count);
	}

		//System.out.println(count);
	}



