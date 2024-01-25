public class Stack2 {
    private static final int MAX_SIZE=100;
    private int[] stackArray =new int [MAX_SIZE];
    private int top=-1;
// Declaring public for push()
    public void push(int value){
        if(top< MAX_SIZE-1){
            stackArray[++top]=value;
            System.out.println("Pushed: "+value);
        }
        else{
            System.out.println("Stack overflow,can't push");
        }   
    }
// pop()
public void pop(){
    if(top>=0){
        int poppedvalue=stackArray[top--];
        System.out.println("Popped value: "+poppedvalue);
        // return poppedvalue;
    }
    else{
        System.out.println("Stack overflow,can't pop");
    }
}
// peek
public void peek(){
    if(top >=0){
        int peekvalue=stackArray[top];
        System.out.println("peek value: "+peekvalue);
        // return peekvalue;
    }
    else{
        System.out.println("Stack is empty");
    }
}
 
 public static void main(String []arr){
    Stack2 stack =new Stack2();
    stack.push(10);
    stack.push(20);
    stack.push(60);
    stack.push(80);
    stack.push(40);

    stack.pop();
    stack.peek();
    stack.pop();
    stack.pop();
    stack.peek();
 }
}
