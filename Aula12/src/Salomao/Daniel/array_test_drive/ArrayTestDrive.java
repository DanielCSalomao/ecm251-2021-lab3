package Salomao.Daniel.array_test_drive;

import Salomao.Daniel.Model.Conta;

public class ArrayTestDrive {
    public static void main(String[] args) {
        //Array para tipo primitivo
        int [] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 15;
        numeros[2] = -15;
        numeros[3] = 40;
        numeros[4] = 36;

        System.out.println("Passa por todo o Array:");
        for (int i = 0; i < numeros.length; i++){
            int numero = numeros[i];
            System.out.println("Posicao:" +i+ "Valor:" +numero);
        }
        //Array para objetos
        Conta [] contas =  new Conta[3];
        contas[0] = new Conta(55.);
        contas[1] = null;
        contas[2] = new Conta();

        System.out.println("==============");
        System.out.println("Passa pelo Array de Conta:");
        for(Conta conta : contas) {
            System.out.println(conta);
        }

    }
}
