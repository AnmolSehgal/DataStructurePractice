import java.util.*;


public class insertion_sort
{
	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		int size= in.nextInt();
		int a[] = new int[size];
		int key;
		for(int i=0;i<size;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=1;i<size;i++){

			key = a[i];
			int j =i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;

			}
			a[j+1]=key;
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}