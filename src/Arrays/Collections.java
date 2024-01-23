package Arrays;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		ArrayList a2=new ArrayList();
		a2.add(30);
		a2.add(40);
		a1.addAll(a2);
		for(Object o:a1) {
			System.out.println(o);
		}
		System.out.println("----------");
		a1.retainAll(a2);
		for(Object o:a1) {
			System.out.println(o);
		}
		System.out.println("----------");
		a1.removeAll(a2);
		for(Object o:a1) {
			System.out.println(o);
		}
	}

}
