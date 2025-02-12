package ds.stack;

public class App {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
/*
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
*/

        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }

    }
}
