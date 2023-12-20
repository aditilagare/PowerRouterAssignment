package PowerRouterAssignment;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    private Queue<Integer> mainQueue;
    private Queue<Integer> tempQueue;

    public StackUsingQueue() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    public void push(int x) {
        // Move all elements from mainQueue to tempQueue
        while (!mainQueue.isEmpty()) {
            tempQueue.add(mainQueue.poll());
        }

        // Add the new element to mainQueue
        mainQueue.add(x);

        // Move back all elements from tempQueue to mainQueue
        while (!tempQueue.isEmpty()) {
            mainQueue.add(tempQueue.poll());
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return mainQueue.poll();
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return mainQueue.peek();
    }

    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 2

        stack.push(4);
        System.out.println("Top: " + stack.top()); // Output: 4
    }
}
