package group144.dementiev;

/**
 * Interface thar realizing ATD stack logic.
 */
public interface Stack {

    int getSize();

    void push(int value);
    int pop();

    void clear();
}
