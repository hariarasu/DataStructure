class Queue1 {
int MAX_SIZE=100;
int[] queueArray=new int [MAX_SIZE];
int size=0;int front=0;int rear=-1;
public void enqueue(int value){
    if(size < MAX_SIZE){
      rear=(rear+1)%MAX_SIZE;
      queueArray[rear]=value;
      size++;
      System.out.println("Enqueue value: "+value);
    }
    else{
        System.out.println("Queue overflow,cannot reach the limit");
    }
}
public void dequeue(){
  if(size > 0){
    int dequeuevalue=queueArray[front];

    front=(front+1)%MAX_SIZE;
    size--;
    System.out.println("dequeue value:"+dequeuevalue);
  }
  else{
    System.out.println("queue is overflow");
  }
}
// Peek
public void peek(){
    if(size>=0){
      int peekvalue =queueArray[front];
      System.out.println("Peek value:"+peekvalue);
    }
    else{
      System.out.println("Can not peek,queue is empty");
    }
}
}
public class Queue{
public static void main(String[] arr ){
   Queue1 queue=new Queue1();
   queue.enqueue(10);
   queue.enqueue(20);
   queue.enqueue(90);
   queue.enqueue(60);
   queue.dequeue();
   queue.peek();
   queue.dequeue();
   queue.peek();
}
    
}
