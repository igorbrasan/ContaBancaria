package cliente;

public class PessoaFisica extends Pessoa{

    private String nomeSocial, cpf, nomePai, nomeMae;
    private String naturalidade, telefone;

    public PessoaFisica(String nome, String telefone, Endereco endereco, String nomeSocial, String cpf, String nomePai, String nomeMae, String naturalidade, String telefone1) {
        super(nome, telefone, endereco);
        this.nomeSocial = nomeSocial;
        this.cpf = cpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.naturalidade = naturalidade;
        this.telefone = telefone1;
    }

    /*
    * */
    public PessoaFisica(String nome, String cpf, String nomePai, String nomeMae, String naturalidade, String telefone, Endereco endereco) {
        super(nome, telefone, endereco);
        this.nomeSocial = nome;
        this.cpf = cpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.naturalidade = naturalidade;
        this.telefone = telefone;
    }

}
