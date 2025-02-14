import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        double N1, N2, Media;

        // Leitura das notas
        System.out.print("Digite a primeira nota: ");
        N1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        N2 = scanner.nextDouble();

        // Cálculo da média
        Media = (N1 + N2) / 2;

        // Verificação da média e impressão do resultado
        if (Media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // Fechamento do Scanner
        scanner.close();
    }
}