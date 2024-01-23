package com.jsp.stringprogram;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ravi kumar";
		String s1="";
		char ch[]=s.toCharArray();
		int i=ch.length-1;
		int j=ch.length-1;
		while(j>-1)
		{
			while(j>-1&&ch[j]!=' ')
			{
				j--;
			}
			int k=j+1;
			String temp="";
			while(k<=i)
			{
				temp+=ch[k];
				k++;
			}
			s1+=temp;
			s1+=" ";
			j--;
			i=j;
		}
		System.out.println(s1);
		

	}

}
