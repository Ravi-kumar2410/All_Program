package com.jsp.arrays;

public class SecondMinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,4,6,3,9,7,0,8,10};
		int b=a[0];
		int c=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<b)
			{
				c=b;
				b=a[i];
			}
			else if(a[i]<c&&a[i]!=b)
				c=a[i];
				
		}
		System.out.println(c);
	}


	}


