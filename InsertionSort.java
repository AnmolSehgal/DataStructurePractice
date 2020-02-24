import java.util.*;


class InsertionSort
{	
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		int size = Sc.nextInt();
		int a[]  = new int[size];
		int temp;
		for(int i=0;i<size;i++)
		{
			a[i] = Sc.nextInt();
		}
		for(int i =0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}