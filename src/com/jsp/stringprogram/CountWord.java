package com.jsp.stringprogram;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ravi kuar is bood boy";
		int count=0;
		String[]a=s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			count++;
		}
     System.out.println(count);
	}

}
