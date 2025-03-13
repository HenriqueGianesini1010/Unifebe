import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro do funcionário
        System.out.println("Cadastro do Funcionário:");
        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Funcionarios funcionario = new Funcionarios(matricula, nome, email, cargo, telefone, endereco);

        // Lançar vendas e faltas
        for (int i = 0; i < 3; i++) {
            System.out.printf("Mês %d - Total de vendas: ", i + 1);
            double vendas = scanner.nextDouble();
            funcionario.lancarVendas(i, vendas);

            System.out.printf("Mês %d - Faltas injustificadas: ", i + 1);
            int faltas = scanner.nextInt();
            funcionario.lancarFaltas(i, faltas);
        }

        // Verificar a condição do funcionário
        System.out.println("Condição do Funcionário: " + funcionario.verificarCondicao());

        scanner.close();
    }
}
