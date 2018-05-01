package group144.dementiev;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileSpiralPrinter extends SpiralPrinter {

    public void print(int[][] array) throws FileNotFoundException {
        SpiralPrinter printer = new SpiralPrinter();
        PrintStream stream = new PrintStream("output.txt");
        for (int i : printer.printSpiralOrder(array)) {
            stream.print(i + " ");
        }
    }
}
