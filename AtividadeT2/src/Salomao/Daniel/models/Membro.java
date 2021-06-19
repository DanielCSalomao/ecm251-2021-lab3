package Salomao.Daniel.models;


import Salomao.Daniel.interfaces.Apresentacao;
import Salomao.Daniel.interfaces.PostarMensagem;

public abstract class Membro implements Apresentacao, PostarMensagem {
    private String nome;
    private String funcao;

    public Membro(String nome, String funcao){
        this.nome = nome;
        this.funcao = funcao;
    }

    @Override
    public String apresentaMembro() {
        return null;
    }

    @Override
    public String postaMensagem() {
        return null;
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
