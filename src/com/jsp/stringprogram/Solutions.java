package com.jsp.stringprogram;

public class Solutions {

	public static void main(String[] args) {

		        int[]a={1,2,3,3,4,5,7,3,4};
		        int val=3;
		        for(int i=0;i<a.length;i++){
		            if(a[i]==val){
		               a[i]=0;
		            }
		        }
		        for(int i=0;i<a.length;i++){
		            if(a[i]!=0){
		                System.out.print(a[i]);
		            }
		        }
		    }
		

	}


