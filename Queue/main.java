import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    	// Write your code here
    	Scanner sc = new Scanner(System.in);
    	int test = sc.nextInt();
    	int a[];
    	int size,element,next=0;
    	for(int i=0;i<test;i++)
      {
          	int i = 0; 
            stack s = new stack(); 
            s.top = -1; 
            int element, next; 
            s.push(a[0]); 
            for (i = 1; i < n; i++) 
            { 
                next = a[i]; 

                if (s.isEmpty() == false) 
                { 
                  element = s.pop(); 
                  while (element < next) 
                  { 
                    System.out.println(element + " --> " + next); 
                    if (s.isEmpty() == true) 
                       break; 
                    element = s.pop(); 
                   } 
                  if (element > next) 
                      s.push(element); 
                } 
                s.push(next); 
        } 
          while (s.isEmpty() == false) 
          { 
                element = s.pop(); 
                next = -1; 
                System.out.println(element + " -- " + next); 
    } 
  }
}
}
class Stack
{
  	int array[];
  	int top;
  	Stack(int size)
    {
      	top=-1;
      	array = new int[size];
    }
  	public boolean isEmpty()
    {
      	return(top==-1);
    }
  	public boolean isFull()
    {
      return (top==array.length-1);
    }
  	public void push(int data)
    {
      	if(isFull()!=true)
        {
          	array[++top]=data;
        }
    }
  	public int pop()
    {
      	int d;
      	if(isEmpty()!=true)
        {
          	d=array[top];
          	top--;
          	return d;
        }
      	return -1;
    }
}