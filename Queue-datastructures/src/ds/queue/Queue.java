package ds.queue;

public class Queue {

    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int count;

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[size];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    public void insert(long j){
        if(rear==maxSize-1){    //Circular Queue
            rear = -1;
        }
        rear++;
        queueArray[rear] = j;
        count++;
    }

    public long remove(){
        long removed = queueArray[front];
        front++;
        if(front==maxSize){
            front = 0;
        }
        count--;
        return removed;
    }

    public long peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (count==0);
    }

    public boolean isFull(){
        return (count==maxSize);
    }

    public void show(){
        System.out.println("Elements in the Queue are ");
        System.out.println("***************************");
        for(int i=0; i<queueArray.length; i++){
            System.out.print(queueArray[i] + " ");
        }
    }
}
