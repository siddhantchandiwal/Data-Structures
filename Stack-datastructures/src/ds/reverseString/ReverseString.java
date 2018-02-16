package ds.reverseString;

public class ReverseString {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public ReverseString(int size){
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char j){
        top++;
        stackArray[top] = j;
    }

    public char pop(){
        int old_top = top;
        top--;
        return stackArray[old_top];
    }

    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top== -1);
    }

    public boolean isFull(){
        return (maxSize-1 == top);
    }
}
