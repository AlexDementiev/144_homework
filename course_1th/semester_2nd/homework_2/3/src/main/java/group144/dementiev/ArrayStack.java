package group144.dementiev;

/** Class that implements the stack on the list.*/
public class ArrayStack implements Stack {

    private int current = 0;
    private int size = 10;
    private int[] array = new int[size];

    /**
     * Returns stack size.
     * @return stack size.
     */
    @Override
    public int getSize() {
        return current;
    }

    /**
     * Adding element to stack.
     * @param value element to add.
     */
    @Override
    public void push(int value) {
        if (current == size - 1){
            resize(array);
        }

        array[current] = value;
        current++;
    }

    /**
     * Returns first element in stack.
     * @return first element in stack.
     */
    @Override
    public int pop() {
        if (current == 0) {
            return 0;
        }
        current--;

        return array[current + 1];
    }

    /**
     * Delete all elements from stack;
     */
    @Override
    public void clear() {
        current = 0;
    }

    private void cut(int[] array) {
        if (current < size / 2 - 1) {
            int[] newArray = new int[size / 2];
            for (int i = 0; i < size; i++)
                newArray[i] = array[i];
            size /= 2;
            array = newArray;
        }
    }

    private void resize(int[] array) {
        int[] newArray = new int[size * 2];
        for (int i = 0; i < size; i++)
            newArray[i] = array[i];
        size *= 2;
        array = newArray;
    }
}
