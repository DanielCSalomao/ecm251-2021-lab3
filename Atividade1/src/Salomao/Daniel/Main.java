package Salomao.Daniel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Contas 1, 2 e 3

        Scanner scanner = new Scanner(System.in);

        Contas c1;
        System.out.println("Digite nome do usuario 1:");
        String nomeC1 = scanner.nextLine();
        c1 = new Contas(nomeC1, 1000);

        Contas c2;
        System.out.println("Digite nome do usuario 2:");
        String nomeC2 = scanner.nextLine();
        c2 = new Contas(nomeC2, 250);


        Contas c3;
        System.out.println("Digite nome do usuario 3:");
        String nomeC3 = scanner.nextLine();
        c3 = new Contas(nomeC3, 3000);

        //Estado Inicial codigo

        System.out.println("Estado Inicial:");
        System.out.println("Nome Usuário: " + c1.toString());
        System.out.println("Nome Usuário: " + c2.toString());
        System.out.println("Nome Usuário: " + c3.toString());



        Transacoes transacoes = new Transacoes();
        //transacao 1
        String t1 = transacoes.receber(250,c1);
        transacoes.pagamentos(c1,c2,t1);
        transacoes.pagamentos(c1,c3,t1);
        transacoes.pagamentos(c1,c2,t1);
        //transacao 2
        String t2 = transacoes.receber(1000,c2);
        transacoes.pagamentos(c2,c3,t2);

        System.out.println("Estado Final:");
        System.out.println("Nome Usuário: " + c1.toString());
        System.out.println("Nome Usuário: " + c2.toString());
        System.out.println("Nome Usuário: " + c3.toString());
    }
}
