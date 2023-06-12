package AB07;

import java.util.Stack;

public class StackTesting {
    public void testStackMethods() {
        Stack myStackTesting = new Stack<String>();
        myStackTesting.push("Eva");
        myStackTesting.push("Thomas");

        myStackTesting.push("Max");

        myStackTesting.push("Lina");

        System.out.println(myStackTesting);

        System.out.println("Pop "+ myStackTesting.pop());

        System.out.println(myStackTesting);

        System.out.println("Peek "+ myStackTesting.peek());

        System.out.println(myStackTesting);
    }

}
