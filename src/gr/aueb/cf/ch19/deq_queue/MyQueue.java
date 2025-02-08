package src.gr.aueb.cf.ch19.deq_queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * FIFO impl with Deque
 */
public class MyQueue<T> {
    private final Deque<T> myQueue = new LinkedList<>();

    public Deque<T> getMyQueue() {
        return myQueue;
    }

    public MyQueue() {

    }

    public void enQueue(T t) {
        myQueue.addLast(t);
    }

    public T deQueue() {
        return myQueue.poll();
    }

    public void forEach(Consumer<T> action) {
        myQueue.forEach(action);
    }
}
