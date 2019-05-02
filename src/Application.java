import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        NuclearPlant nuclearPlant =new NuclearPlant();
        System.out.println("please enter proton value : ");
        int proton = scanner.nextInt();
        nuclearPlant.reactor(proton);
    }

}
