
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        NuclearPlant nuclearPlant =new NuclearPlant();
        PyramidPrinter pyramidPrinter = new PyramidPrinter();
        System.out.println("please enter  value : ");
        int value = scanner.nextInt();
        //nuclearPlant.reactor(value);
        pyramidPrinter.pyramidGenerator(value);
    }

}
