package group144.dementiev;

/** Class that implements the stack on the list.*/
public class ListStack implements Stack {

    private SimpleLinkedList list = new SimpleLinkedList();

    /**
     * Returns stack size.
     * @return stack size.
     */
    @Override
    public int getSize() {
        return list.getSize();
    }

    /**
     * Adding element to stack.
     * @param value element to add.
     */
    @Override
    public void push(int value) {
        list.add(value);
    }

    /**
     * Returns first element in stack.
     * @return first element in stack.
     */
    @Override
    public int pop() {
        if (!list.isEmpty())
            return list.get();
        return 0;
    }

    /**
     * Delete all elements from stack;
     */
    @Override
    public void clear() {
        list.clear();
    }
}
