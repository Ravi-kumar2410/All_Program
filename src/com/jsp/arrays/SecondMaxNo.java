package com.jsp.arrays;

public class SecondMaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,9,3,8,6,4};
		int b=0;
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>b)
			{
				c=b;
				b=a[i];
			}
			else if(a[i]>c&&a[i]!=b)
				c=a[i];
				
		}
		System.out.println(c);
	}

}
