package patterns;

import java.util.Scanner;

public class RemoveDuplicatWordUsingDelimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 
		        String inputSentence = "happy happy birthday birthday celebration";
		        Scanner scanner = new Scanner(inputSentence);

		        scanner.useDelimiter(" "); // Set space as the delimiter
		        StringBuilder result = new StringBuilder();

		        while (scanner.hasNext()) {
		            String word = scanner.next();
		            if (!result.toString().contains(word)) {
		                result.append(word).append(" ");
		            }
		        }

		        System.out.println("Sentence with duplicate words removed: " + result.toString().trim());
		    }
		


	}


