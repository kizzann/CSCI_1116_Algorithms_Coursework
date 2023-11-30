import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E> {
    LinkedList<E> list = new LinkedList<>();
    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }

    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();

        queue.enqueue("Wendell");
        System.out.println(queue);

        queue.enqueue("Charles");
        System.out.println(queue);

        queue.enqueue("Keith");
        System.out.println(queue);

        queue.enqueue("Alex");
        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }
}