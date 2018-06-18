import java.util.Scanner;

public class Conversion {
    Scanner sc = new Scanner(System.in);
    /**
     * Display all available possibilities of conversion
     */
    public void displayAvailablePossibilities(){
        System.out.println("Convertisseur de température");
        System.out.println("Choisissez le mode de conversion :");
        System.out.println("1 - Convertir de degré celsius à degré farheineit");
        System.out.println("2 - Convertir de degré farheineit à degré celsius");
    }

    public void runConversion() {
        this.displayAvailablePossibilities();
        int nbChoice;
        nbChoice = sc.nextInt();
    }
}
