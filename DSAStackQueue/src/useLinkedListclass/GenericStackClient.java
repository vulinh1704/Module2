package useLinkedListclass;

public class GenericStackClient {
    private static void stackOfIsString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("1.3. Size of stack after pop operations : " + stack.size());
    }

    private static void stackOfIsInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.println("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("2.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1.Stack of Integer : ");
        stackOfIsInteger();
        System.out.println("\n2.Stack of String : ");
        stackOfIsString();
    }
}
