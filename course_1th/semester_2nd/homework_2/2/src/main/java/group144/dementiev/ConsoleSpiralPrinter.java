package group144.dementiev;

import java.io.PrintStream;

public class ConsoleSpiralPrinter {

    public void print(int[][] array) {
        SpiralPrinter printer = new SpiralPrinter();
        PrintStream stream = new PrintStream(System.out);
        for (int i : printer.printSpiralOrder(array)) {
            stream.print(i + " ");
        }
    }
}
