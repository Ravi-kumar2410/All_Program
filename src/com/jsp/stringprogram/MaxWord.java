package com.jsp.stringprogram;

public class MaxWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		        String sentence = "happy happy happy as as vv vv vv vv birtt";

		        // Split the sentence into words
		        String[] words = sentence.split(" ");

		        // Initialize variables to track the max count and corresponding words
		        int maxCount = 0;
		        String maxWords = "";

		        // Iterate through each word and count occurrences
		        for (String a : words) {
		            int count = 0;

		            // Compare with every other word
		            for (String compareWord : words) {
		                if (a.equals(compareWord)) {
		                    count++;
		                }
		            }

		            // Update max count and word(s) if needed
		            if (count > maxCount) {
		                maxCount = count;
		                maxWords = a;
		            } //else if (count == maxCount && !maxWords.contains(a)) {
		               // maxWords += " " + a;
		           // }
		           // System.out.println(count)
		        }
		        System.out.println("Repeated word(s) with the maximum count: " + maxWords + " " + maxCount );
		       // System.out.println(maxCount);
		    }
}
		