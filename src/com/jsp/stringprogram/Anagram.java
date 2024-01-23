package com.jsp.stringprogram;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="slient";
		String s1="listen";
		if(isAnagram(s,s1)) { 
			System.out.println(s + "anagram" + s1);
		}
			else {
			System.out.println(" not Anagram");
			
		}

	}
	
	
	
	public static boolean isAnagram(String s,String s1) {
		
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		
		while(true) {
			//if(s.length()!= s1.length()) 
				//return false;
			
		if(s.length()==0&&s1.length()==0) 
			return true;
		
		char ch=s.charAt(0);
		s=s.replace(ch+" ", " ");
		s1=s1.replace(ch+" ", " ");
		
		
	}

}
}
