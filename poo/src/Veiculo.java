// Pacote "poo"
package poo;

// Classe Veiculo dentro do pacote "poo"
public class Veiculo {
    // Atributos privados
    private String modelo;
    private String cor;
    private int ano;

    // Construtor padrão
    public Veiculo() {
        // Construtor padrão vazio
    }

    // Métodos modificadores (setters) para definir os valores dos atributos
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Métodos de acesso (getters) para obter os valores dos atributos
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    // Método exibe para mostrar os valores das variáveis
    public void exibe() {
        System.out.println("Modelo: " + getModelo() + ", Cor: " + getCor() + ", Ano: " + getAno());
    }
}

