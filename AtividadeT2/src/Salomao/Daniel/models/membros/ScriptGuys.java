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
}
