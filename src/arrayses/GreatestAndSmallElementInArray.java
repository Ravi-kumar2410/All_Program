package arrayses;

public class GreatestAndSmallElementInArray {

	public static void main(String[] args) {
		
		int a[]= {5,9,3,8,6,4};
		int b=a[0];
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<b)
			{
				b=a[i];
			}
		}
		System.out.println(b);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>c)
			{
				c=a[i];
			}
		}
		System.out.println(c);

	}

}
