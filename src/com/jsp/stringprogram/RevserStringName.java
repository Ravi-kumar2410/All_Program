package com.jsp.stringprogram;

public class RevserStringName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is easy";
		String s1=" ";
		String [] a=s.split(" ");
		
		for(int i=a.length-1;i>=0;i--) {
			s1+=a[i];
			
		
		}
			System.out.println(s1);
		}
		

	}


