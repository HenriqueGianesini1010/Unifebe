public class CalculadoraDeFuncoes {

    // Declaração dos atributos X e Y
    private double X;
    private double Y;

    // Construtor que inicializa os valores de X e Y
    public CalculadoraDeFuncoes(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    // Método que calcula a função a: X^2 + 2Y - 1
    public double funcaoA() {
        // Calcula e retorna o valor de X^2 + 2Y - 1
        return Math.pow(X, 2) + 2 * Y - 1;
    }

    // Método que calcula a função b: (X^3 - 2 + 5X^2) / 3
    public double funcaoB() {
        // Calcula e retorna o valor de (X^3 - 2 + 5X^2) / 3
        return (Math.pow(X, 3) - 2 + 5 * Math.pow(X, 2)) / 3;
    }

    // Método que imprime os valores das funções
    public void ImpressaoDeValores() {
        // Imprime o resultado da função A
        System.out.println("Resultado da Função A: " + funcaoA());
        // Imprime o resultado da função B
        System.out.println("Resultado da Função B: " + funcaoB());
    }

    // Método principal para executar o código
    public static void main(String[] args) {
        // Cria uma instância da classe CalculadoraDeFuncoes com valores de exemplo
        CalculadoraDeFuncoes calculadora = new CalculadoraDeFuncoes(5, 3);
        // Chama o método para imprimir os valores calculados
        calculadora.ImpressaoDeValores();
    }
}
