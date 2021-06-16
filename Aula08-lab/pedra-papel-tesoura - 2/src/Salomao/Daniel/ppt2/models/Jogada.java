package Salomao.Daniel.ppt2.models;


import Salomao.Daniel.ppt2.enumeracoes.Resultado;


public abstract class Jogada {
    final public Resultado verificarResultado(Jogada jogada) {
        if(verificarSeGanhei(jogada)){
            return Resultado.GANHOU;
        }
        if (verificarSePerdi(jogada)){
            return Resultado.PERDEU;
        }
        return Resultado.EMPATOU;
    }

    final private boolean verificarSePerdi(Jogada jogada) {
        for (Jogada jogadaAtual : jogadasQuePerco()) {
            if (jogadaAtual.getClass() == jogada.getClass()) {
                return true;
            }
        }
        return false;
    }

    final private boolean verificarSeGanhei(Jogada jogada) {
        for (Jogada jogadaAtual : jogadasQueVenco()) {
            if (jogadaAtual.getClass() == jogada.getClass()) {
                return true;
            }
        }
        return false;
    }

    public abstract Jogada[] jogadasQueVenco();
    public abstract Jogada[] jogadasQuePerco();
}