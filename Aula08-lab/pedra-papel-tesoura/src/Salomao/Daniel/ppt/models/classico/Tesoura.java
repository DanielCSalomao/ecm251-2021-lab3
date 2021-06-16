package Salomao.Daniel.ppt.models.classico;


import Salomao.Daniel.ppt.models.Jogada;

public class Tesoura extends Jogada {

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return jogada instanceof Papel;
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return jogada instanceof Pedra;
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}