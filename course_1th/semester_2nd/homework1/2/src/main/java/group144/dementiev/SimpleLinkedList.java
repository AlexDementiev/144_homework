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

    public void add(int value) {
        if (isEmpty()) {
            head = new Node(value, null);
            size++;
            return;
        }

        Node tmp = head.next;
        head = new Node(value, tmp);
        size++;
    }

    public void addByIndex(int value, int index) {
        if (index > size)
            return;

        Node tmp = head;
        while (index > 2) {
            tmp = tmp.next;
            index--;
        }

        Node temp = tmp.next;
        tmp.next = new Node(value, temp);
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

    public int getByIndex(int index) {
        if (index > size)
            return -42;

        Node tmp = head;
        while (index > 2) {
            tmp = tmp.next;
            index--;
        }

        int result = tmp.next.value;
        tmp.next = tmp.next.next;
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
