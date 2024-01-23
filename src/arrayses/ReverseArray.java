package arrayses;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a= {2,4,1,3,8,5,9,3};
		int b[]=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>0;i--) {
			b[j]=a[i];
			j++;
		}
		System.out.println("reverse array");
		for(int rev:b) {
			System.out.print(rev+" ");
		}

	}

}
