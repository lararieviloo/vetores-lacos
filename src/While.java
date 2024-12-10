import java.util.Arrays;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        System.out.println("Digite 5 números: ");

        int i = 0;
        while (i < 5) {
            System.out.println("Digite um número para a posição " + i + ":");
            number[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Segue a lista de números: " + Arrays.toString(number));
        scanner.close();
    }
}