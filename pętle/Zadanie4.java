import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int correctPin = 1234;
        System.out.print("Podaj pin: ");
        int pin = in.nextInt();
        for (int wPin = 2; wPin > 0; wPin--) {
            if (correctPin != pin) {
                System.out.println("Zły pin!");
                System.out.print("Podaj pin: ");
                pin = in.nextInt();
            } else {
                System.out.println("Poprawny pin!");
                break;
            }
        }
        if (pin != correctPin) {
            System.out.println("Konto zablokowane");
        }
    }
}