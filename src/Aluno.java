import java.util.Scanner;

public class Aluno {
    private String nome;
    private String cpf;
    private int idade;

    public Aluno(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String buscaCpfPorNome(String nome) {
        if(this.nome.equals(nome)) {
            return this.cpf;
        
        }

        return null;
    }	// fim do método buscaCpfPorNome

    public String buscaNomePorCpf(String cpf) {
        return this.nome;
    }	// fim do método buscaNomePorCpf

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade;
    }




}
