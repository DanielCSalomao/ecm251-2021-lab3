package Salomao.Daniel.models.membros;

import Salomao.Daniel.enums.TipoMembro;
import Salomao.Daniel.models.Membro;

public class BigBrothers extends Membro {
    private static int id =0;

    public BigBrothers(String nome, TipoMembro tipoMembro){
        super(nome);
        this.tipoMembro=tipoMembro;
        this.id = getId();
    }

    public static int getId() {
        return id;
    }
    {
        id+=1;
    }

    @Override
    public String apresentaMembro() {
        return "Nome: " + this.getNome() + " Função: Big Brothers";
    }

    @Override
    public String postaMensagemNormal() {
        return "Sempre ajudando as pessoas membros ou não S2!";
    }

    @Override
    public String postaMensagemExtra() {
        return "...";
    }
}
