package com.jsp.stringprogram;

public class ConvertJavaToPython {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        // Input string
		        String input = "I love java";

		        // Split the input string by space
		        String[] words = input.split("\\s+");

		        // Replace "java" with "python"
		        for (int i = 0; i < words.length; i++) {
		            if (words[i].equals("java")) {
		                words[i] = "python";
		            }
		        }

		        // Reconstruct the string
		        String output = "";
		        for (int i = 0; i < words.length; i++) {
		            output += words[i];
		            if (i < words.length - 1) {
		                output += " ";
		            }
		        }

		        // Print the result
		        System.out.println(output);
		    }
		

	}


