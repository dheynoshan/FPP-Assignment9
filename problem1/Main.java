package problem1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();
        System.out.println("Initial peek: " + q.peek());
        System.out.println("Initial dequeue: " + q.dequeue());
        System.out.println("Initial check for empty: " + q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.isEmpty());
        q.enqueue(4);
        q.enqueue(5);
        System.out.println("Check for empty after adding elements: " + q.isEmpty());
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        //Adding element after the initial array is full
        q.enqueue(11);
        System.out.println("Printing the queue: ");
        q.print();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("Printing the queue after removing all the elements");
        q.print();
        System.out.println(q.isEmpty());



    }
}
