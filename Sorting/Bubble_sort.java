import java.util.*;

public class Bubble_sort
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=in.nextInt();
		}	
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(a[j]>a[j+1])
				{
					a[j+1]=a[j+1]+a[j];
					a[j]=a[j+1]-a[j];
					a[j+1]=a[j+1]-a[j];
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}	
	}
}