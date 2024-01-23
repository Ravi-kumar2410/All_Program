package Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] a= {1,2,3,5,6,9};
     int key=2;
     int b=search(a,key,0,a.length-1);
	System.out.println(b);
     }
	public static int search(int[]a,int key,int start,int end) {
		if(start>end)return -1;
		int mid=((start+end)/2);
		if(key==a[mid])return mid;
		else if(key>a[mid])
			return search(a,key,mid+1,end);
		else
			return search(a,key,start,mid-1);
	}
	

}
