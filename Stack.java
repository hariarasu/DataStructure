// syntax to create stack
class Stack1{
    int top=-1;
    int maxsize=100;
    int[] stackArray=new int [maxsize];
public void push(int value){
    if(top <maxsize -1){
        stackArray[++top]=value;
    }
    else{
        System.out.println("stack is full, cannot push the value");
    }
}
// pop()
public void pop(){
    if(top >=0){
        int poppedvalue =stackArray[top--];
        System.out.println("popped value: "+poppedvalue);
        // return poppedvalue;
    }
    else{
        System.out.println("stack underflow, cannot pop the value");
    }
}
// peek()
public void peek(){
    if(top >=0){
      int peekvalue =stackArray[top];
      System.out.println("Peekvalue in the stack is :"+peekvalue);
    //   return peekvalue;
    }
    else{
        System.out.println("Stack is empty,can't peek");
    }
}
}
public class Stack {
    public static void main(String []arr){
    Stack1 stack =new Stack1();
    
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    // calling the created stack method
    stack.pop();
    stack.peek();
    }
}
