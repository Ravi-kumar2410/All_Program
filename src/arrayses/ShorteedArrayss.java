package arrayses;

import java.util.ArrayList;
import java.util.Arrays;

public class ShorteedArrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int []a= {2,3,6,4,1,9,4};
		ArrayList a=new ArrayList();
		a.add(5);
		a.add(2);
		a.add(9);
		a.add(8);
		a.add(7);
		a.add(6);
		
		System.out.println(a);
		Object[]ab=new Object[a.size()];
		//Arrays.sort(a);
	     a.toArray(ab);
		Arrays.sort(ab);
		
		System.out.println(Arrays.toString(ab));

	}

}
