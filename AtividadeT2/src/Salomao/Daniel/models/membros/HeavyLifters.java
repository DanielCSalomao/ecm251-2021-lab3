package Salomao.Daniel.models.membros;

import Salomao.Daniel.enums.TipoMembro;
import Salomao.Daniel.models.Membro;

public class HeavyLifters extends Membro {
    private static int id =0;

    public HeavyLifters(String nome, TipoMembro tipoMembro){
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
