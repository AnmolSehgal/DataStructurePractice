import java.util.*;

public class merge_two_array
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int size1 = in.nextInt();
		int size2 = in.nextInt();
		int a[] = new int[size1];
		int b[] = new int[size2];
		
		for(int i=0;i<size1;i++)
		{
			a[i] = in.nextInt();
		}
		for(int i=0;i<size2;i++)
		{
			b[i] = in.nextInt();
		}
		int newArray[] = mergeArray(a,b);
		for (int i=0;i<size1+size2 ;i++ ) 
		{
			System.out.println(newArray[i]);	
		}
	}
	static int[] mergeArray(int a[],int b[])
	{
		int newArray[] = new int[a.length+b.length];
		int n=0,m=0;
		for(int i=0;i<a.length+b.length;i++)
		{
			if(n<a.length && m<b.length && a[n]<=b[m])
			{
				newArray[i] = a[n];
				n++;
			}
			else if(  n<a.length && m<b.length && a[n]>b[m])
			{
				newArray[i] = b[m];
				m++;
			}

			else
			{
				if(n==a.length)
				{
					newArray[i] = b[m];
					m++;
				}
				else if(m==b.length)
				{
					newArray[i] = a[n];
					n++;
				}
			}
		
		}
		return newArray;
	}
}