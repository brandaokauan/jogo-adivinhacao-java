import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numUsuario = 0;
        int numAletario = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas <= 5) {
            System.out.println("Adivinhe um número entre 0 e 100: ");
            numUsuario = leitura.nextInt();
            tentativas ++;

            if (numUsuario == numAletario) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + "tentativas!");
                break;
            }

            if (numUsuario > numAletario) {
                System.out.println("Seu número é maior!!!");
            } else {
                System.out.println("Seu número é menor!!!");
            }

            if (tentativas == 5 && numUsuario != numAletario) {
                System.out.println("Você perdeu em 5 tentativas. O número era: " + numAletario);
            }
        }
    }
}
