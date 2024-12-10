import java.util.Arrays;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        System.out.println("Digite 5 números: ");

        for(int i = 0; i < number.length; i++) {
            System.out.println("Digite um número para a posição " + i + ":");
            number[i] = scanner.nextInt();
        }

        System.out.println("Segue a lista de números: " + Arrays.toString(number));
        scanner.close();
    }

}
