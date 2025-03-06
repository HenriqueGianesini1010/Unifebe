// Classe principal TestaVeiculo fora do pacote "poo"
public class TestaVeiculo {
    public static void main(String[] args) {
        // Instanciando dois objetos da classe Veiculo
        poo.Veiculo veiculo1 = new poo.Veiculo();
        poo.Veiculo veiculo2 = new poo.Veiculo();

        // Atribuindo valores usando os métodos set
        veiculo1.setModelo("Modelo A");
        veiculo1.setCor("Vermelho");
        veiculo1.setAno(2024);

        veiculo2.setModelo("Modelo B");
        veiculo2.setCor("Azul");
        veiculo2.setAno(2025);

        // Utilizando o método exibe para mostrar os valores das variáveis
        veiculo1.exibe();
        veiculo2.exibe();
    }
}
