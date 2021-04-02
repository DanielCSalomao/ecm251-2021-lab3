package Salomao.Daniel;

import java.util.Random;

public class Transacoes{

        private static int getRandomNumberInRange(int min, int max) {
                Random r = new Random();
                return r.nextInt((max - min) + 1) + min;
        }

        private Contas contas;
        private Usuarios usuarios;

        public Usuarios getUsuarios(){
                return usuarios;
        }
        public Contas getContas(){
            return contas;
        }

        public String receber(int valor, Contas conta){
                int numeroRandom = getRandomNumberInRange(1000,9999);
                return "" + conta.getidConta() + ";" +conta.getUsuarios() + ";" + valor + ";" + numeroRandom;
        }



}
