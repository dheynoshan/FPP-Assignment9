package problem2;

interface StackInterface {
    public void push(Object ob);

    public Object pop();

    public Object peek();

    public boolean isEmpty();

    public int size();
}

public class LinkedListStack implements StackInterface {
    private LinkNode top;
    private int size = 0;

    public void push(Object ob){
        LinkNode toPush = new LinkNode(ob);
        if(top==null)
            top = toPush;
        else
            toPush.next = top;
            top = toPush;
        size++;
    }

    public Object pop(){
        if(top==null)
            return null;
        else{
            LinkNode temp = top;
            top = top.next;
            size--;
            return temp;
        }
    }

    public Object peek(){
        if(top==null)
            return null;
        else
            return top.obj;
    }

    public boolean isEmpty(){
        return (top==null);
    }

    public int size(){
        return size;
    }

    public void display(){
        LinkNode temp = top;
        if(temp==null)
            System.out.println("Stack is empty");
        while (temp!=null){
            System.out.println(temp.obj);
            temp = temp.next;
        }
    }

    private class LinkNode{
        private Object obj;
        private LinkNode next;
        LinkNode(Object obj){
            this.obj = obj;
        }
    }
}
