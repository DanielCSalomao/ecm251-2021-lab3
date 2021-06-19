package Salomao.Daniel;

import Salomao.Daniel.enums.HorarioSistema;
import Salomao.Daniel.models.Membro;
import Salomao.Daniel.models.membros.BigBrothers;
import Salomao.Daniel.models.membros.HeavyLifters;
import Salomao.Daniel.models.membros.MobileMembers;
import Salomao.Daniel.models.membros.ScriptGuys;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Sistema {
    //Ints para contar quantidade de membros para cada grupo
    static int idMM = 0, idHL = 0,idSG = 0 ,idBB = 0;

    //Horário do sistema, quando isistema é par, NORMAL, quando ímpar, EXTRA
    static int iSistema = 2;
    private Scanner scanner;
    public Sistema(){
        scanner = new Scanner(System.in);
    }

    //mapa para membros (utilizando mapas para com as keys, organizar membros e posição
    Map<String, Membro> itemMap = new HashMap<>();

    //void run começa aqui
    public void run(){
        boolean continuar = true;
        do{
    //iniciando sistema, mostra menu e avalia uma opção também considerando um grupo
            System.out.println("\nSistema em Horário " + horarioSistema());
            menu();
            int opcao = scanner.nextInt();
            avaliarOpcao(opcao,idMM,idHL,idSG,idBB);
        }while(continuar);
    }

    private HorarioSistema horarioSistema() {
        if(iSistema%2==0)
            return HorarioSistema.NORMAL;
        else
            return HorarioSistema.EXTRA;
    }
    //avaliar opção, com 5 opções diferentes
    private void avaliarOpcao(int opcao,int idMM, int idHL,int idSG, int idBB) {
        switch (opcao){

    //opção case 0, adicionar membro. Pedir o grupo e nome do membro
    //adicionar com as keys informadas o membro no grupo desejado
            case 0:
                System.out.println("Informe um grupo entre: MM, HL, SG, BB: ");
                String opcaoGrupo = scanner.next().toUpperCase();

                switch (opcaoGrupo){
                    case "MM":
                        System.out.println("Informe o nome: ");
                        String nomeMM = scanner.next();
                        String addKeyMM = opcaoGrupo + String.valueOf(idMM);
                        itemMap.put(addKeyMM, new MobileMembers(nomeMM,opcaoGrupo));
                        this.idMM+=1;
                        break;

                    case "HL":
                        System.out.println("Informe o nome: ");
                        String nomeHL = scanner.next();
                        String addKeyHL = opcaoGrupo + String.valueOf(idHL);
                        itemMap.put(addKeyHL, new HeavyLifters(nomeHL,opcaoGrupo));
                        this.idHL+=1;
                        break;

                    case "SG":
                        System.out.println("Informe o nome: ");
                        String nomeSG = scanner.next();
                        String addKeySG = opcaoGrupo + String.valueOf(idSG);
                        itemMap.put(addKeySG, new ScriptGuys(nomeSG,opcaoGrupo));
                        this.idSG+=1;
                        break;

                    case "BB":
                        System.out.println("Informe o nome: ");
                        String nomeBB = scanner.next();
                        String addKeyBB = opcaoGrupo + String.valueOf(idBB);
                        itemMap.put(addKeyBB, new BigBrothers(nomeBB,opcaoGrupo));
                        this.idBB+=1;
                        break;
                }break;
    //caso 1, modificar o horário do sistema, aqui somente adicionei 1 ao valor de iSistema
            case 1:
                this.iSistema+=1;
                System.out.println("Horário do Sistema modificado!\n");
                break;
    //caso 2, Postar Mensagem
            case 2:
                System.out.println("Informe qual grupo vai postar mensagem: HH, HL, SG, BB");
                break;
    //caso 3, remover membro
    //informando grupo e número do membro (começando com 1 não 0), encontro a key desse membro e fica fácil remover
            case 3:
                System.out.println("Informe um grupo entre: MM, HL, SG, BB: ");
                String opcaoGrupoRetirar = scanner.next().toUpperCase();
                System.out.println("Informe o numero do membro: ");
                String NMembro = scanner.next();
                String removeKey = opcaoGrupoRetirar + NMembro + 1;
                itemMap.remove(removeKey);
                break;
    //exibir relatório, aqui chamo a interface apresentaMembro
            case 4:
                System.out.println("Exibindo relatório dos membros: ");
                itemMap.forEach((chave, valor) -> System.out.println(valor.apresentaMembro()+" Id: "+chave));

                break;

        }
    }

    private void menu() {
        System.out.println("Selecione uma ação:");
        System.out.println("0. Registrar Membros");
        System.out.println("1. Trocar Horário do Sistema");
        System.out.println("2. Postar Mensagem");
        System.out.println("3. Remover Membro");
        System.out.println("4. Exibir Relatório");
        }

    }
