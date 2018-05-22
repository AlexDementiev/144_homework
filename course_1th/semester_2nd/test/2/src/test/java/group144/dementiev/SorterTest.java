package group144.dementiev;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class SorterTest {

    @Test
    public void bubbleSortInteger() {
        Sorter<Integer> sorter = new Sorter<>();
        Integer[] array = {5, 1, 4, 2, 3};
        Integer[] expected = {5, 4, 3, 2, 1};
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1.equals(o2)) {
                    return 0;
                } else {
                    return 1;
                }
            }
        };

        sorter.bubbleSort(array, comparator);
        assertArrayEquals(expected, array);
    }

    @Test
    public void bubbleSortString() {
        Sorter<String> sorter = new Sorter<>();
        String[] array = {"mama", "ah", "pop", "t"};
        String[] expected = {"ah", "mama", "pop", "t"};
        Comparator<String> comparator = String::compareTo;

        sorter.bubbleSort(array, comparator);
        assertArrayEquals(expected, array);
    }

    @Test
    public void bubbleSortChar() {
        Sorter<Character> sorter = new Sorter<>();
        Character[] array = {'m', 'a', 'p', 't'};
        Character[] expected = {'a', 'm', 'p', 't'};
        Comparator<Character> comparator = Character::compareTo;

        sorter.bubbleSort(array, comparator);
        assertArrayEquals(expected, array);
    }

    @Test
    public void bubbleSortDouble() {
        Sorter<Double> sorter = new Sorter<>();
        Comparator<Double> comparator = Double::compareTo;
        Double[] array = {100.123, 0.2, 45.9, 45.81};
        Double[] expected = {0.2, 45.81, 45.9, 100.123};

        sorter.bubbleSort(array, comparator);
        assertArrayEquals(expected, array);
    }
}