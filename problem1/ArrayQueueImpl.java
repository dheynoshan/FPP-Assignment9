package problem1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
    public void enqueue(int obj){
        if(size()==arr.length){
            resize();
        }
        arr[rear++] = obj;
        if(front==-1)
            front++;
    }
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        else
            return arr[front++];
    }
    public boolean isEmpty(){
        return (front==rear || front==-1);
    }
    public int size(){
        return (rear-front);
    }
    private void resize(){
        System.out.println("Resizing...");
        int[] temp = new int[2*arr.length];
        System.arraycopy(arr, 0, temp, 0, rear);
        arr = temp;
    }
    public void print(){
        int[] temp = new int[rear-front];
        System.arraycopy(arr, front, temp, 0, rear-front);
        System.out.println(Arrays.toString(temp));
    }
}
