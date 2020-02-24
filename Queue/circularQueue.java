import java.util.*;

class circularQueueUsingArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		CircularQueue cq = new CircularQueue(sc.nextInt());
		for(int i = 0 ;i<cq.queueArray.length;i++)
		{
			cq.enQueue(sc.nextInt());
		}
		System.out.println(cq.deQueue());
		cq.enQueue(sc.nextInt());
		while(cq.isEmpty()!=true)
		{

			System.out.println(cq.deQueue());

		}
		if(cq.deQueue()==-1)
		{
			System.out.println("Queue is empty");
		}
	}
}
class CircularQueue
{
	int front,rear,dQ;
	int []queueArray;
	CircularQueue(int s)
	{
		queueArray = new int[s];
		front=-1;
		rear = -1;
	}
	public boolean isEmpty()
	{
		return (front==rear);
	}
	public void enQueue(int data)
	{
		if(front==-1 && rear==-1)
		{
			front = 0;
			rear = 0;
			queueArray[front] = data;
		}
		else if((front==0 && rear<queueArray.length-1)|| (front!=0 && rear<queueArray.length-1))
		{
			rear++;
			queueArray[rear]=data;
		}
		else if(front!=0 && front-1!=rear)
		{
			if(rear==queueArray.length-1)
				rear =0;
			else
				rear++;
			queueArray[rear]=data;
			
		}
	}
	public int deQueue()
	{
		if(isEmpty()!=true)
		{
			dQ=queueArray[front];
			if(front == queueArray.length - 1 && rear<front)
			{
				front = 0 ;
			}
			else 
			{
				front++;
			}
			return dQ;
		
		}
		return -1;
	}
}
