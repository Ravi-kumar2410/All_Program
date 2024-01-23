package com.jsp.stringprogram;

import java.util.Arrays;

public class AnagramWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="slienjt";
		String s1="listenh";
		
		char[]a=s.toCharArray();
		char[]b=s1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result=Arrays.equals(a,b);
		
		if(result==true) {
			System.out.println("anagram");
		}
			else {
				System.out.println("not Anagram");
			}
		}
	}


