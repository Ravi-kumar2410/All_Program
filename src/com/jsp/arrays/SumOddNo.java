package com.jsp.arrays;

public class SumOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,15,19,20,22,26};
		int b=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0) 
				b+=a[i];
			
		}
		System.out.println(b);
	}

	}
