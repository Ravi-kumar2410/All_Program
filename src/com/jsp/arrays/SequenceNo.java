package com.jsp.arrays;

public class SequenceNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,1,19,2,22,26};
        int b; 
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;j++)
			{
				if(a[i]>a[j]) {
				b=a[i];
				a[i]=a[j];
				a[j]= b;
				}
						
			}
	
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
