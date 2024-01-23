package com.jsp.arrays;

public class SmallestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,1,19,2,22,26};
        int b=a[0]; 
		for(int i=0;i<a.length;i++)
		{
			//a[i]=a.length;
			//for(int j=i+1;i<a.length;j++)
			//{
				if(b>a[i]) 
		           b=a[i];
				}
						
			
			System.out.println(b);
	
	}

	}

