public class PessoaFisica extends Pessoa{
    private String rg;
    private String cpf;

    public PessoaFisica(String nome, String logradouro, String bairro, String cidade, String estado,
                        String cep, int telefone, String email, String rg, String cpf) {
        super(nome, logradouro, bairro, cidade, estado, cep, telefone, email);
        this.rg = rg;
        this.cpf = cpf;
    }

    public PessoaFisica(){
        super();
        this.rg = "";
        this.cpf = "";
    }

    public PessoaFisica(String nome, String rg){
        super(nome);
        this.rg = rg;
    }

    public PessoaFisica(String nome, String rg, String cpf){
        super(nome);
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
