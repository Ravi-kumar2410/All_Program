package com.jsp.stringprogram;

public class BinarySeaarch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] a= {1,2,3,5,6,9};
	     int key=5;
	     int b=search(a,key);
		System.out.println(b);

	}
	public static int search(int[]a,int key) {
		int start=0;
		int end=a.length-1;
		while(start<end) {
		int mid=((start+end)/2);
		if(key==a[mid])return mid;
		else if(key>a[mid])
			end=mid+1;
		else
		start=mid-1;
		
	}
	
	return -1;
	}
	
	

}
