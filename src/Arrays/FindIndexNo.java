package Arrays;

public class FindIndexNo {
	

	    public static int findTargetIndex(int[] a, int target) {
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == target) {
	                return i;
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        int[] a = {1,8,5,8};
	        int target = 8;

	        int result = findTargetIndex(a, target);

	 
	         
				System.out.println("Target " + target + " found at index " + result);
	        
	    }
	}
	
	
	
	
	
	

	
