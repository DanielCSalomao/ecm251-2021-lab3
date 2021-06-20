package Salomao.Daniel.models;


import Salomao.Daniel.enums.TipoMembro;
import Salomao.Daniel.interfaces.Apresentacao;
import Salomao.Daniel.interfaces.PostarMensagem;

public abstract class Membro implements Apresentacao, PostarMensagem {
    protected TipoMembro tipoMembro;
    private String nome;

    public Membro(String nome){
        this.nome = nome;
    }

    @Override
    public String apresentaMembro() {
        return null;
    }

    @Override
    public String postaMensagemNormal() {
        return null;
    }

    @Override
    public String postaMensagemExtra() {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public TipoMembro getTipoMembro() {
        return tipoMembro;
    }
}
