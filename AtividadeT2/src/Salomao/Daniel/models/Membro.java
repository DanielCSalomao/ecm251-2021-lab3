package Salomao.Daniel.models;

public class Membro {
    private String nome;
    private String email;
    private String funcao;


    public Membro(String nome, String funcao, String email){
        this.nome = nome;
        this.funcao = funcao;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }
}
