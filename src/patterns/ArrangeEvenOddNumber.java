package patterns;

import java.util.Arrays;

public class ArrangeEvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {9,2,5,7,6,8,2,4,4,3,60};
		add(a);
		System.out.println(Arrays.toString(a));
	}
       
	public static	void add(int[]a) {
		int []res=new int[a.length];
		int b=0;
		int c=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				res[ b]=a[i];
				b++;
			}else {
				res[ c]=a[i];
				c--;
			}
		}
		System.arraycopy(res,0,a,0,a.length);
		
	
	}

}
