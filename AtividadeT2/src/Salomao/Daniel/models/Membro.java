package Salomao.Daniel.models;


import Salomao.Daniel.interfaces.Apresentacao;

public abstract class Membro implements Apresentacao {
    private String nome;
    private String funcao;

    public Membro(String nome, String funcao){
        this.nome = nome;
        this.funcao = funcao;
    }


    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return "Membro{" +
                "nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }


}
