package patterns;

public class Dividedby77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int[] a = {1, 3, 4, 70, 56, 68};
		        int t = 77;
		        System.out.println(find(a, t));
		    }

		    public static int find(int[] a, int t) {
		        int count = 0;
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] > t && a[i] % 7 == 0) {
		                count++;
		            }
		        }
		        return count;
		    
		

	}

}
