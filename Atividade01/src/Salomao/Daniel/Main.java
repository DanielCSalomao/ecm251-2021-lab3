package Salomao.Daniel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta c1;
        System.out.println("Digite nome do usuario 1:");
        String nomeC1 = scanner.next();
        c1 = new Conta(nomeC1, 1000);
        c1.idConta = 0;

        Conta c2;
        System.out.println("Digite nome do usuario 2:");
        String nomeC2 = scanner.next();
        c2 = new Conta(nomeC2, 250);
        c2.idConta = 1;

        Conta c3;
        System.out.println("Digite nome do usuario 3:");
        String nomeC3 = scanner.next();
        c3 = new Conta(nomeC3, 3000);
        c3.idConta = 2;

        //Estado Inicial codigo

        System.out.println("Estado Inicial:");
        System.out.println("Nome Usuário: " + c1.toString());
        System.out.println("Nome Usuário: " + c2.toString());
        System.out.println("Nome Usuário: " + c3.toString());



    }
}