package Salomao.Daniel.models.membros;

import Salomao.Daniel.models.Membro;

public class BigBrothers extends Membro {

    public BigBrothers(String nome, String funcao){
        super(nome, funcao);

    }
    @Override
    public String apresentaMembro() {
        return "Nome: " + this.getNome() + " Função: Big Brothers";
    }


}
