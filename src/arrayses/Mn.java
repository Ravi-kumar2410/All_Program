package arrayses;

import java.util.ArrayList;
import java.util.Iterator;

 class Mn {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		 

		        ArrayList al = new ArrayList();
		        al.add("jdij");
		        al.add(3);
		        al.add("ravi");
		        al.add("diee");

		        Iterator i = al.iterator();
		        while (i.hasNext()) {
		            Object s = i.next();
		            if (s.equals("diee")) {
		                i.remove(); // Use iterator's remove method to remove the current element
		            }
		        }

		        System.out.println(al);
		    }
		}