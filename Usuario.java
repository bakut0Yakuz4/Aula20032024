package Aula20032024;

public class Usuario {

    private int idade;
    private String RG;
    private String nome;
    private String CPF;
    private String endereco;

    public Usuario(String nome, int idade, String RG, String endereco, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRG() {
        return RG;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCPF() {
        return CPF;
    }
}