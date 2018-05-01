package group144.dementiev;

public class SpiralPrinter implements SpiralPrintable {

    @Override
    public int[] printSpiralOrder(int[][] array) {

        int[] result = new int[array.length * array.length];
        int delta = 2;
        int iCurrent = array.length / 2;
        int jCurrent = array.length / 2;
        int current = 0;

        result[current] = array[array.length / 2][array.length / 2];
        iCurrent++;
        delta = 3;
        current++;

        if (array.length < 3)
            return result;

        while (!(jCurrent == 0 && iCurrent == array.length - 1)) {
            while (jCurrent <= array.length - ((array.length - delta) / 2) - 1) {
                result[current] = array[iCurrent][jCurrent];
                current++;
                jCurrent++;
            }
            jCurrent--;
            iCurrent--;
            while (iCurrent >= ((array.length - delta) / 2)) {
                result[current] = array[iCurrent][jCurrent];
                current++;
                iCurrent--;
            }
            iCurrent++;
            jCurrent--;
            while (jCurrent >= ((array.length - delta) / 2)) {
                result[current] = array[iCurrent][jCurrent];
                current++;
                jCurrent--;
            }
            iCurrent++;
            jCurrent++;
            while (iCurrent <= array.length - ((array.length - delta) / 2) - 1) {
                result[current] = array[iCurrent][jCurrent];
                current++;
                iCurrent++;
            }
            if (iCurrent == array.length) {
                iCurrent--;
            }
            delta += 2;
        }
        return result;
    }
}
