import java.util.*;


class QueueUsingArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue(sc.nextInt());
		while(q.isFull()!=true)
			q.enQueue(sc.nextInt());
		if(q.isFull()==true)
		{
			System.out.println("Queue is full");
		}
		while(q.isEmpty()!=true)
		{
			System.out.println(q.deQueue());
		}
		if(q.deQueue()==-1)
		{
			System.out.println("Queue is empty");
		}

	}
}

class Queue
{
	int []queueArray;
	int front,rare;
	public Queue(int size)
	{
		queueArray = new int [size];
		front  = -1;
		rare = -1;
	}
	public void enQueue(int data)
	{
		if(isFull()!=true)
		{
			queueArray[++rare] = data;
		}
	}
	public int deQueue()
	{
		if(isEmpty()!=true)
		{
			return queueArray[++front];
		}
		return -1;
	}
	public boolean isEmpty()
	{
			return (front==rare);
	}
	
	public boolean isFull()
	{
			return (rare == queueArray.length-1);
	}


}