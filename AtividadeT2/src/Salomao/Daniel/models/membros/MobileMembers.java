package Salomao.Daniel.models.membros;

import Salomao.Daniel.enums.TipoMembro;
import Salomao.Daniel.models.Membro;

public class MobileMembers extends Membro {

    public MobileMembers(String nome, TipoMembro tipoMembro){
        super(nome);
        this.tipoMembro=tipoMembro;
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
