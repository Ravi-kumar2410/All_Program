package patterns;

import java.util.Arrays;

public class Sorting {

	//private static int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ravi is did zas ce abc good boy";
		String[] s1=s.split(" ");
		sort(s1);
		System.out.println(Arrays.toString(s1));

	}
		public static void sort(String[]s1) {
		for(int i=0;i<s1.length-1;i++) {
			for(int j=0;j<s1.length-1-i;j++) {
				if(s1[j].compareTo(s1[j+1])>0) {
					String t=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=t;
				}
			}
		}
		
		
	
		//return (s1[j+1]);
		}
	
		



}
