package com.jsp.stringprogram;

public class Ravu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String input = "Bangalore Bangalore is Bangalore Bangalore ";
		        String[] words = input.split(" ");
		        StringBuilder result = new StringBuilder();
		        String prevWord = null;
		        for (String word : words) {
		            if (!word.equals(prevWord)) {
		                result.append(word).append(" ");
		            }
		            prevWord = word;
		        }
		        String output = result.toString().trim();
		        
		       System.out.println(output);
		        
		    }


	}


