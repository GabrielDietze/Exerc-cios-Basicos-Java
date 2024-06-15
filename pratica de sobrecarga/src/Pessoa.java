public class Pessoa {
    private String nome;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private int telefone;
    private String email;

    public Pessoa(String nome, String logradouro, String bairro, String cidade, String estado,
                  String cep, int telefone, String email){
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }

    public Pessoa() {
        this.nome = "";
        this.logradouro = "";
        this.bairro = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.telefone = 0;
        this.email = "";
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
