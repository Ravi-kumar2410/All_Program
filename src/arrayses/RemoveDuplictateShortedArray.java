package arrayses;

public class RemoveDuplictateShortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,23,3,58,59,50,5,6,6};
		//int b[]=new int[a.length];
		
		for(int i=0;i<a.length-1;i++) {
		     if(a[i]!=a[i+1])
				System.out.println(a[i]);
		}
		System.out.println(a[a.length-1]);

	}

}
