package Salomao.Daniel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Cria um objeto do tipo Conta
        Conta c1;
        //Instancia um objeto Conta
        System.out.println("Digite nome do usuario 1:");
        String nomeC1 = scanner.next();
        c1 = new Conta(nomeC1, 1000);

        System.out.println("Digite nome do usuario 2:");
        String nomeC2 = scanner.next();
        Conta c2 = new Conta(nomeC2, "123456789-9");
        c1.depositar(300);
        c1.sacar(250);
        System.out.println("Conta 1:" + c1.toString());;
        System.out.println("Conta 2:" + c2.toString());;
    }

}