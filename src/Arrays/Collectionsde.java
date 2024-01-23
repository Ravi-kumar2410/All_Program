package Arrays;
import java.util.ArrayList;

import java.util.Collection;
import java.util.ListIterator;
public class Collectionsde {
    public static void main(String[]args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("zink");
		a1.add("ravi");
		a1.add("vivek");
		a1.add("vinod");
	ListIterator<String> i=a1.listIterator();
	while(i.hasNext()) {
		String s1=i.next();
		if(s1.equals ("ravi"));
		i.set("god");
		}
	System.out.println(a1);
}
}
