package com.jsp.stringprogram;

public class BigestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="keep";
		String big="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+2;j<s.length();j++) {
				
			
			String s1=s.substring(i,j);
					if(biggest(s1))
					{
						if(big.length()<s1.length())
						{
							big=s1;
						}
					}
		}
		}
	
		System.out.println(big);
	}
	
	public static boolean biggest(String s) {
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
		
	       
		//return false;
	}

	

	}
