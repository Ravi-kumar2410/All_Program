package com.jsp.arrays;

public class RemoveDpNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] a= {1,2,3,4,5,5,3};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) 
					a[j]=0;
				
				
			}
			
			
			
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
			System.out.println(a[i]);
		}

	}

}
