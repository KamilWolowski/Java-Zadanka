import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj wielkość choinki: ");
        int size = in.nextInt();
        for (int top = size; top > 0; top--) {
            for (int space = top; space >= 0; space--)
                System.out.print(" ");
            for (int star = 2 * (size - top) + 1; star > 0; star--)
                System.out.print("*");
            System.out.println();
        }
    }
}