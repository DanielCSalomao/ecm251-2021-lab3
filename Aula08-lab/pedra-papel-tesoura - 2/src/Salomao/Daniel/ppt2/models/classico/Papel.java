package Salomao.Daniel.ppt2.models.classico;

import Salomao.Daniel.ppt2.models.Jogada;
import Salomao.Daniel.ppt2.models.bazinga.Lagarto;
import Salomao.Daniel.ppt2.models.bazinga.Spoke;

public class Papel extends Jogada {

    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }

    @Override
    public String toString() {
        return "Papel";
    }
}