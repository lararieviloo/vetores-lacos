import java.util.Arrays;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int[] number = new int[5];
        System.out.println("Digite 5 números: ");

        do {
            System.out.print("Digite um número para a posição " + i + ": ");
            number[i] = scanner.nextInt();
            i++;
        } while (i < 5);

        System.out.println("Segue a lista de números: " + Arrays.toString(number));
        scanner.close();
    }
}
