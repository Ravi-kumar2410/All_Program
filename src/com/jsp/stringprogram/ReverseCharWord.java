package com.jsp.stringprogram;

public class ReverseCharWord {

	public static void main(String[] args) {
		String s="ravi kumar";
		String s1="";
		char ch[]=s.toCharArray();
		int i=0;
		int j=0;
		while(i<s.length())
		{
			while(j<s.length()&&ch[j]!=' ')
			{
				j++;
			}
			int k=j-1;
			String temp="";
			while(k>=i)
			{
				temp+=ch[k];
				k--;
			}
			s1+=temp;
			s1+=" ";
			j++;
			i=j;
		}
		System.out.println(s1);
		


	}

}
