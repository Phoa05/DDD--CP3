public class instituicaoCaridade {
    private String nome;
    private int cnpj;
    private String endereco;
    private String contato;
    private String areaAtuacao;
    private String voluntarios;
    private String histDoacaoRecebida;

    //Getter e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
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

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(String voluntarios) {
        this.voluntarios = voluntarios;
    }

    public String getHistDoacaoRecebida() {
        return histDoacaoRecebida;
    }

    public void setHistDoacaoRecebida(String histDoacaoRecebida) {
        this.histDoacaoRecebida = histDoacaoRecebida;
    }
}
