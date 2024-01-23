package Arrays;

import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {3,7,9,2,1,6,5};
		  System.out.println(Arrays.toString(a));
		
		sort(a);
		  System.out.println(Arrays.toString(a));
		

	}
	public static void sort(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])
					index=j;
			}
			//if(i!=index)not compulsory
			{
				int t=a[index];
				a[index]=a[i];
				a[i]=t;
			}
		}
	}

}
