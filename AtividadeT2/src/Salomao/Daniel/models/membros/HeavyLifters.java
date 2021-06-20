package Salomao.Daniel.models.membros;

import Salomao.Daniel.enums.TipoMembro;
import Salomao.Daniel.models.Membro;

public class HeavyLifters extends Membro {

    public HeavyLifters(String nome, TipoMembro tipoMembro){
        super(nome);
        this.tipoMembro=tipoMembro;
    }
    @Override
    public String apresentaMembro() {
        return "Nome: " + this.getNome() + " Função: Heavy Lifters";
    }
    @Override
    public String postaMensagemNormal() {
        return "Podem contar conosco!";
    }

    @Override
    public String postaMensagemExtra() {
        return "N00b_qu3_n_Se_r3pita.bat";
    }
}
