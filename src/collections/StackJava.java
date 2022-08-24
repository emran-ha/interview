package collections;

import java.util.Stack;

class StackJava {
    public static void main(String[] args) {
        Stack<Integer> stck = new Stack<>();
        stck.push(12);
        stck.push(13);
        stck.push(14);
        stck.push(15);
        System.out.println(stck.peek());
        System.out.println(stck.pop());
        System.out.println(stck.peek());
        System.out.println(stck.isEmpty());
        System.out.println(stck.search(14));

    }
}
