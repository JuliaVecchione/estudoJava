package classificarnumeros;
import java.util.Scanner;

public class Classificarnumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nPares = 0;
        int nImpares = 0;
        int multiplosDe5 = 0;

        System.out.println("Insira um número inteiro positivo (ou um número negativo para sair):");
        
        int numero = scanner.nextInt();
        
        while (numero >= 0) {
            if (numero % 2 == 0) {
                nPares++;
            } else {
                nImpares++;
            }
            if (numero % 5 == 0) {
                multiplosDe5++;
            }

            System.out.println("Insira um número inteiro positivo (ou um número negativo para sair):");
            numero = scanner.nextInt();
        }

        System.out.println("\nResultados:");
        System.out.println("Números pares: " + nPares);
        System.out.println("Números ímpares: " + nImpares);
        System.out.println("Múltiplos de 5: " + multiplosDe5);

        scanner.close();
    }
}
