package Arrays;
import java.util.ArrayList;
import java.util.List;


public class FinfTargetIndexValue {

		// TODO Auto-generated method stub
		//import java.util.ArrayList;
		//import java.util.List;

		    public static List<Integer> findTargetIndices(int[] arr, int target) {
		        List<Integer> al = new ArrayList<>();

		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == target) {
		                al.add(i);
		            }
		        }

		        return al.isEmpty() ?List.of(-1) : al;
		    }

		    public static void main(String[] args) {
		        int[] array = {2, 3, 8, 5, 8};
		        int targetValue = 6;

		        List<Integer> al = findTargetIndices(array, targetValue);

		        if (al.get(0) != -1) {
		            System.out.println("Target value found at indices: " + al);
		        } else {
		            System.out.println(-1);
		        }
		    }
		

	}


