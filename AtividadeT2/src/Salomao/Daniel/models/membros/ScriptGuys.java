package Salomao.Daniel.models.membros;

import Salomao.Daniel.models.Membro;

public class ScriptGuys extends Membro {
    public ScriptGuys(String nome, String funcao){
        super(nome, funcao);
    }

    @Override
    public String apresentaMembro() {
        return "Nome: " + this.getNome() + " Função: Script Guys";
    }
    @Override
    public String postaMensagemNormal() {
        return "Prazer em ajudar novos amigos de código!";
    }

    @Override
    public String postaMensagemExtra() {
        return "QU3Ro_S3us_r3curs0s.py";
    }
}
