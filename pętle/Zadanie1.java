import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj Swoje hasło: ");
        String correctpassword = in.nextLine();
        String password;
        do {
            System.out.print("Podaj hasło: ");
            password = in.nextLine();
            if (!correctpassword.equals(password));
        }while (!correctpassword.equals(password));
        System.out.println("Dobre hasło!");
    }
}
