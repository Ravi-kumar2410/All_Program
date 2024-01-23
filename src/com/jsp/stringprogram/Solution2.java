package com.jsp.stringprogram;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,2,4,3,2,2,1,3,4,3,6,};
         //int val=3;
         int b= removeElement(a,3);
        System.out.println("count " + b);
	}
       public static int removeElement(int[] a, int val) {
		        int index = 0;
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] != val) {
		                a[index] = a[i];
		                index++;
		            }
		        }
		        
		        return index;
		        
	

}
}
