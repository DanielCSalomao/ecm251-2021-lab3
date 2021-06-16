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
            menu();
            int opcao = scanner.nextInt();
        }while(continuar);
    }

    private void menu() {
        System.out.println("Selecione uma ação:");
        System.out.println("1. Registrar Membros");
        System.out.println("2. Horário do Sistema");
        System.out.println("3. Postar Mensagem");
        System.out.println("4. Remover Membro");
        System.out.println("5. Exibir Relatório");
        }
    }

