package Salomao.Daniel.pedra_papel_tesoura.models.classico;


import Salomao.Daniel.pedra_papel_tesoura.models.Jogada;

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