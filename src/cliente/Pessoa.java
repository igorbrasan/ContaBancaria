package cliente;

/**
 * Escreva uma descrição da classe Pessoa aqui.
 * 
 * @author Igorbrasan
 * @version 0.1
 */
public class Pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome, telefone;
    private Endereco endereco;

    public Pessoa(String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
