
//Daniel Coimbra Salomão 19.02177-0
//Andre Bonito Saad 18.01391-0

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

        //gerar string de recebimento

        public String receber(int valor, Contas conta){
                int numeroRandom = getRandomNumberInRange(1000,9999);
                return "" + conta.getidConta() + ";" + conta.getUsuarios() + ";" + valor + ";" + numeroRandom;
        }

        //realizar o pagamento
        public void pagamentos(Contas cReceber, Contas cPagar, String code){

                String[] dados = code.split(";");
                int num = Integer.parseInt(dados[2]);

                //checar se id e nomes são existentes e retornam um usuario
                if (Integer.valueOf(dados[0]) == Integer.valueOf(cReceber.getidConta())) {
                        if (dados[1].equals(String.valueOf(cReceber.getUsuarios()))) {
                                cPagar.transferirDinheiro(cReceber, num);
                        } else {
                                System.out.println("nome da conta incorreto, operação não realizada!");
                        }
                } else {
                        System.out.println("id de conta incorreto, operação não realizada!");
                }


        }

}
