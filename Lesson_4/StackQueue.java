package AlgoritmyStructure;

import java.util.*;

public class StackQueue {

    public static void main(String[] args) {

        StackExample();
        QueueLinkedListExample();
        DequeExample();

    }

    private static void DequeExample() {
        Deque<String> stringDeque = new ArrayDeque<>();

        stringDeque.add("one");
        stringDeque.offer("two");
        stringDeque.addLast("three");
        stringDeque.offerLast("four");
        stringDeque.addFirst("zero");
        stringDeque.offerFirst("minus one");
        stringDeque.push("minus two");

        System.out.println(stringDeque.element());
        System.out.println(stringDeque.getLast());

        while (!stringDeque.isEmpty()) {
            stringDeque.removeLast();
            System.out.println(stringDeque.peekLast());
        }
    }

    private static void QueueLinkedListExample() {
        Queue<String> stringQueue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            stringQueue.add(String.format("%02d", i));
        }
        stringQueue.offer("Я последний элемент");

        System.out.println("Размер очереди: " + stringQueue.size());

        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.peek());
            System.out.println(stringQueue.element());
            stringQueue.remove();
        }
    }

    private static void StackExample() {
        Stack stackList = new Stack();
        for (int i = 0; i < 10; i++) {
            stackList.push(String.format("%02d", i));
        }
        while (!stackList.empty()) {
            System.out.println(stackList.peek());
            stackList.pop();
        }
    }


}
