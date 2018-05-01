package group144.dementiev;

public class QSort implements Sorter {

    @Override
    public void sort(int[] array) {
        recursiveQSort(array, 0, array.length  -1);
    }

    private void recursiveQSort(int[] array, int first, int last) {
        if (first <= last)
            return;

        int pivot  = array[(first + last) / 2];
        int i = first;
        int j = last;

        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j) {
               int tmp = array[i];
               array[i] = array[j];
               array[j] = tmp;
               i++;
               j--;
            }
        }
    }
}
