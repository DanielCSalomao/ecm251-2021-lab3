package Salomao.Daniel.models.membros;

import Salomao.Daniel.models.Membro;

public class MobileMembers extends Membro {

    public MobileMembers(String nome, String funcao){
        super(nome, funcao);
    }

    @Override
    public String apresentaMembro() {
        return "Nome: " + this.getNome() + " Função: Mobile Members" ;
    }
    @Override
    public String postaMensagemNormal() {
        return "Happy Coding!";
    }

    @Override
    public String postaMensagemExtra() {
        return "Happy_C0d1ng. Maskers";
    }
}
