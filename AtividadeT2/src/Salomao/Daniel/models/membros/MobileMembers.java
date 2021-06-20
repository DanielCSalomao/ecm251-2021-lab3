package Salomao.Daniel.models.membros;

import Salomao.Daniel.enums.TipoMembro;
import Salomao.Daniel.models.Membro;

public class MobileMembers extends Membro {
    private static int id =0;

    public MobileMembers(String nome, TipoMembro tipoMembro){
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
