package Salomao.Daniel.pedra_papel_tesoura.models.bazinga;

import Salomao.Daniel.pedra_papel_tesoura.models.Jogada;
import Salomao.Daniel.pedra_papel_tesoura.models.classico.Papel;
import Salomao.Daniel.pedra_papel_tesoura.models.classico.Pedra;
import Salomao.Daniel.pedra_papel_tesoura.models.classico.Tesoura;

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

