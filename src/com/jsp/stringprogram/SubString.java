package com.jsp.stringprogram;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1="malayalam";
     for(int i=0;i<s1.length();i++) {
    	 for(int j=i+2;j<s1.length();j++) {
    		System.out.println(s1.substring(i,j)); 
    	 }
    			 
     }
	}

}
