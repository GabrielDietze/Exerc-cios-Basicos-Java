public class PessoaJuridica extends Pessoa{
    private int inscricao;
    private int cnpj;

    private String razao_social;

    public PessoaJuridica(String nome, String logradouro, String bairro, String cidade, String estado, String cep, int telefone, String email, int inscricao, int cnpj){
        super(nome, logradouro, bairro, cidade, estado, cep, telefone, email);
        this.inscricao = inscricao;
        this.cnpj = cnpj;
    }

    public PessoaJuridica(){
        super();
        this.inscricao = 0;
        this.cnpj = 0;
    }

    public PessoaJuridica(String razao_social, int inscricao){
        this.razao_social = "";
        this.inscricao = 0;
    }

    public PessoaJuridica(String razao_social, int inscricao, int cnpj){
        this.razao_social = "";
        this.inscricao = 0;
        this.cnpj = 0;
    }

    public int getInscricao(){
        return inscricao;
    }

    public void setInscricao(int inscricao){
        this.inscricao = inscricao;
    }

    public int getCnpj(){
        return cnpj;
    }

    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
}
