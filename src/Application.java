
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        NuclearPlant nuclearPlant =new NuclearPlant();
        PyramidPrinter pyramidPrinter = new PyramidPrinter();
        NumberPattern numberPattern =new NumberPattern();
        System.out.println("please enter  value : ");
        int value = scanner.nextInt();
        nuclearPlant.reactor(value);
        pyramidPrinter.pyramidGenerator(value);
        numberPattern.numberGenerator(value);
    }

}
