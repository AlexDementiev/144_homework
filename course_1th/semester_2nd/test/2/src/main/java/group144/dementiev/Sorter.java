package group144.dementiev;

import java.util.Comparator;

/**
 * Class realizing bubble sort logic.
 *
 * @param <T> type of array element (should be comparable).
 */
public class Sorter <T extends Comparable<T>> {

    /**
     * Bubble sort returns an array sorted in the order specified by the comparator.
     *
     * @param array array of elements for sorting.
     * @param comparator object for comparing elements of this type(<T>).
     * @return sorted array
     */
    public  T[] bubbleSort(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (comparator.compare(array[j], array[j+1]) > 0) {
                    T tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
