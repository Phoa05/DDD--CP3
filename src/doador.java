public class doador {
    //Atributos
    private String nome;
    private int cpf;
    private String endereco;
    private String contato;
    private String histDoacao;

    public String getNome() {
        return nome;
    }

    //Getter e Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getHistDoacao() {
        return histDoacao;
    }

    public void setHistDoacao(String histDoacao) {
        this.histDoacao = histDoacao;
    }
}
