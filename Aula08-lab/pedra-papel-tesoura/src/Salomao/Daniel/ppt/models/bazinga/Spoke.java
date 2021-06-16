package Salomao.Daniel.ppt.models.bazinga;

import Salomao.Daniel.ppt.models.Jogada;
import Salomao.Daniel.ppt.models.classico.Papel;
import Salomao.Daniel.ppt.models.classico.Pedra;
import Salomao.Daniel.ppt.models.classico.Tesoura;

public class Spoke extends Jogada {

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Tesoura);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}

