package com.jsp.stringprogram;

public class ReverseUsingSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java is very easy";
		String a[]=s.split(" ");
		String s2="";
				for(int i=a.length-1;i>=0;i--)
				{
				s2+=a[i];
				//if(i>0)
					//s2+=" ";
			}
			System.out.println(s2);
		}
}