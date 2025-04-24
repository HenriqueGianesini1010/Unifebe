abstract class Animais {
    protected String nome;
    protected String cor;
    protected String raca;
    protected int idade;


    public Animais(String nome, String cor, String raca, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
