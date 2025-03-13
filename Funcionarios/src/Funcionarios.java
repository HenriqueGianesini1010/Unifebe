class Funcionarios {
    private int matricula;           // Identificador único do funcionário
    private String nome;             // Nome do funcionário
    private String email;            // Email de contato
    private String cargo;            // Cargo ocupado
    private String telefone;         // Telefone de contato
    private String endereco;         // Endereço do funcionário
    private int[] faltas = new int[3];  // Faltas injustificadas nos últimos 3 meses
    private double[] vendas = new double[3]; // Vendas realizadas nos últimos 3 meses

    // Construtor da classe
    public Funcionarios(int matricula, String nome, String email, String cargo, String telefone, String endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Métodos para acessar os dados privados
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCargo() {
        return cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    // Método para lançar vendas de cada mês
    public void lancarVendas(int mes, double valor) {
        if (mes >= 0 && mes < 3) { // Verifica se o mês é válido (0 a 2)
            vendas[mes] = valor;
        }
    }

    // Método para lançar faltas de cada mês
    public void lancarFaltas(int mes, int quantidade) {
        if (mes >= 0 && mes < 3) { // Verifica se o mês é válido (0 a 2)
            faltas[mes] = quantidade;
        }
    }

    // Método para verificar a condição do funcionário
    public String verificarCondicao() {
        // Calcula as médias de vendas e faltas
        double mediaVendas = (vendas[0] + vendas[1] + vendas[2]) / 3;
        double mediaFaltas = (faltas[0] + faltas[1] + faltas[2]) / 3;

        // Verifica as condições conforme as regras fornecidas
        if (mediaVendas >= 1500 && mediaFaltas <= 5) {
            return "ATINGIU A META";
        } else if ((mediaVendas < 1500 && mediaVendas > 1000) || (mediaFaltas > 5 && mediaFaltas < 10)) {
            return "NO LIMITE";
        } else {
            return "VAI PARA LAYOFF";
        }
    }
}
