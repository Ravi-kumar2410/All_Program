package com.jsp.stringprogram;

public class RemoveDuplicateNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {1,2,3,4,5,5,4,3};
		
		for(int i=0;i<a.length;i++) {
			boolean flag=true;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=0;
					flag=false;
				}
			}
			if(!flag)
				a[i]=0;
			
			
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
			System.out.println(a[i]);
		}

	}

}
