package com.jsp.stringprogram;

public class Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+2;j<s.length();j++)
			{
				String s1=s.substring(i,j);
				if(ispalindron(s1))
				System.out.println(s1);
			}
		}

	}
	
	public static boolean ispalindron(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
				i++;
				j--;
		}
		return true;

}
}
