package patterns;

public class MaxReapetedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String s = "Kannnnnaa";
		        String s2 = "";
		        int max = 0;
		        char ch1 = ' ';

		        while (s.length() > 0) {
		            char ch = s.charAt(0);
		            s2 = s.replace(ch + "", "");
		            int count = s.length() - s2.length();
		            if (max < count) {
		                max = count;
		                ch1 = ch;
		            }
		            s = s2;
		        }
		        System.out.println(ch1 + "=" + max);
		    }
		}

		


