package com.jsp.arrays;

public class FetchDupicateWord {

	    public static void main(String[] args) {
	        int[] array = {4,8,9,8,5,2,4,8};

	        for (int i = 0; i < array.length; i++) {
	            boolean isRepeated = false;

	            for (int j = i+1; j < array.length; j++) {
	                if ( i!=j&&array[i]== array[j]) {
	                    isRepeated = true;
	                    break;
	                }
	            }

	            if (isRepeated) {
	                System.out.print(array[i] + " ");
	            }
	        }
	    }
	
			
	

}
