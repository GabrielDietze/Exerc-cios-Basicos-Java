public class PessoaJuridica extends Pessoa{
    private int inscricao;
    private int cnpj;

    public PessoaJuridica(String nome, String logradouro, String bairro, String cidade, String estado, String cep, int telefone, String email, int inscricao, int cnpj){
        super(nome, logradouro, bairro, cidade, estado, cep, telefone, email);
        this.inscricao = inscricao;
        this.cnpj = cnpj;
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
