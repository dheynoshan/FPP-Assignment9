package problem2;

public class Main {
    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();
        st.push("Dheynoshan");
        st.push("Nadarajah");
        System.out.println("Size print");
        System.out.println(st.size());
        System.out.println("Display stack");
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
    }
}
