package basics;
import java.util.Scanner;

public class VATCalculatorKim {

    public static void main(String[] args) {
        double mwst = 19.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen Nettobetrag ein: ");
        double netto = scanner.nextDouble();
        double mwstBerechnung = netto*mwst/100;
        double bruttoBerechnung = netto+mwstBerechnung;
        System.out.println("Netto: " + netto +"€");
        System.out.println("MwSt: " + mwstBerechnung +"€");
        System.out.println("Brutto: " + bruttoBerechnung + "€");

    }
}
