package group144.dementiev;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpiralPrinterTest {

    @Test
    public void printTest() {
        SpiralPrinter printer = new SpiralPrinter();

        int[][] array = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[] expected = {2, 2, 3 ,3, 3, 2, 1, 1, 1};
        int[] actual = printer.printSpiralOrder(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void printOneElementArrayTest() {
        SpiralPrinter printer = new SpiralPrinter();

        int[][] array = {{1}};
        int[] expected = {1};
        int[] actual = printer.printSpiralOrder(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void printBigArrayTest() {
        SpiralPrinter printer = new SpiralPrinter();

        int[][] array = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        int[] expected = {3, 3, 4, 4, 4, 3, 2, 2, 2, 2, 3, 4, 5, 5, 5, 5, 5, 4, 3, 2, 1, 1, 1, 1, 1};
        int[] actual = printer.printSpiralOrder(array);

        for (int i : actual)
            System.out.print(i + " ");

        assertArrayEquals(expected, actual);
    }
}