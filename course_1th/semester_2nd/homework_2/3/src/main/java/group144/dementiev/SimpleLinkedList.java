package group144.dementiev;

public class SimpleLinkedList {

    private Node head;
    private int size;

    SimpleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void add(int value) {
        if (isEmpty()) {
            head = new Node(value, null);
            size++;
            return;
        }

        Node tmp = head;
        head = new Node(value, tmp);
        size++;
    }

    public int get() {
        if (isEmpty())
            return -42;

        int result = head.value;
        head = head.next;
        size--;
        return result;
    }

    private class Node {
        private int value;
        private Node next;

        Node(int value, Node next){
            this.next = next;
            this.value = value;
        }
    }
}
