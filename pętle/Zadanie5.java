import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int rnd1 = rnd.nextInt(11);
        System.out.println("Witaj w grze! Zgadnij liczbe z przedziału 0-10. Masz trzy próby!");
        System.out.print("Zgadnij o tu tu: ");
        int input = in.nextInt();
        int chance = 2;
        do {
            if (input == rnd1) {
                break;
            }
            if (input > rnd1) {
                System.out.println("liczba jest za duża");
            } else {
                System.out.println("liczba jest za mała");
            }
            input = in.nextInt();
            chance -= 1;
        } while (input != rnd1 && chance > 0);

        if (input == rnd1) {
            System.out.println("brawo zgadłeś");
        }
            if (chance == 0 && input != rnd1) {
                System.out.println("nie zgadłeś");
                System.out.print("Twoja liczba to: " + rnd1);
            }
        }
    }