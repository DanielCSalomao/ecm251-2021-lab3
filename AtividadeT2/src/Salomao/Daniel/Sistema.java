package Salomao.Daniel;

import java.util.Scanner;

public class Sistema {
    private Scanner scanner;
    public Sistema(){
        scanner = new Scanner(System.in);
    }

    public void run(){
        boolean continuar = true;
        do{
            mostraAcoes();
        }while(continuar);
    }

    private void mostraAcoes() {
        System.out.println("Selecione uma ação:");
        System.out.println("MM (Mobile Members");
        System.out.println("HL (Heavy Lifters");
        System.out.println("SG (Script Guys");
        System.out.println("BB (Big Brothers");
        String escolha = scanner.nextLine();
        System.out.println("sua escolha: "+escolha);
        }
    }

