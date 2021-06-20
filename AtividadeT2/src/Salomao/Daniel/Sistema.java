package Salomao.Daniel;

import Salomao.Daniel.enums.HorarioSistema;
import Salomao.Daniel.enums.TipoMembro;
import Salomao.Daniel.models.Membro;
import Salomao.Daniel.models.membros.BigBrothers;
import Salomao.Daniel.models.membros.HeavyLifters;
import Salomao.Daniel.models.membros.MobileMembers;
import Salomao.Daniel.models.membros.ScriptGuys;

import java.io.FileWriter;
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
            itemMap.forEach((chave, valor) -> System.out.println(valor.getNome()+"\t"+chave));
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
                System.out.println("Digite um grupo entre: MM, HL, SG, BB: ");
                String opcaoGrupo = scanner.next().toUpperCase();
    //para criar membros de diferentes grupos, usei 4 cases de opções
    //assim, dependendo do grupo que o membro vai ser, já crio um new tipo de membro para adicionar no map
                switch (opcaoGrupo){
                    case "MM":
                        System.out.println("Digite o nome do novo Membro: ");
                        String nomeMM = scanner.next();
    //crio a chave, usando o grupo e para cada grupo tenho uma numeração propria
    //problema: ser remover o membro 2, a chave do 3 não muda, então não teria uma realocação do membro 3 para posicao 2
                        String addKeyMM = opcaoGrupo + String.valueOf(idMM);

                        itemMap.put(addKeyMM, new MobileMembers(nomeMM,TipoMembro.MM));
                        this.idMM+=1;
                        break;

                    case "HL":
                        System.out.println("Digite o nome do novo Membro: ");
                        String nomeHL = scanner.next();
                        String addKeyHL = opcaoGrupo + String.valueOf(idHL);
                        itemMap.put(addKeyHL, new HeavyLifters(nomeHL,TipoMembro.HL));
                        this.idHL+=1;
                        break;

                    case "SG":
                        System.out.println("Digite o nome do novo Membro: ");
                        String nomeSG = scanner.next();
                        String addKeySG = opcaoGrupo + String.valueOf(idSG);
                        itemMap.put(addKeySG, new ScriptGuys(nomeSG,TipoMembro.SG));
                        this.idSG+=1;
                        break;

                    case "BB":
                        System.out.println("Digite o nome do novo Membro: ");
                        String nomeBB = scanner.next();
                        String addKeyBB = opcaoGrupo + String.valueOf(idBB);
                        itemMap.put(addKeyBB, new BigBrothers(nomeBB,TipoMembro.BB));
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
                System.out.println("Postando Mensagens: ");
                if(horarioSistema()==HorarioSistema.NORMAL){
                    itemMap.forEach((chave, valor) -> System.out.println(valor.getNome()+": " + valor.postaMensagemNormal()));
                }else{
                    itemMap.forEach((chave, valor) -> System.out.println(valor.getNome()+": " + valor.postaMensagemExtra()));
                }
                break;
    //caso 3, remover membro
    //informando grupo e número do membro (começando com 1 não 0), encontro a key desse membro e fica fácil remover
            case 3:
                System.out.println("Informe um grupo entre: MM, HL, SG, BB: ");
                String opcaoGrupoRetirar = scanner.next().toUpperCase();
                System.out.println("Informe o numero do membro: ");
                String NMembro = scanner.next();
                String removeKey = opcaoGrupoRetirar + NMembro;
                itemMap.remove(removeKey);
                break;
    //gerar relatório, aqui chamo a interface apresentaMembro
            case 4:
                try{
                    criarNota(itemMap);
                }
                catch (Exception exception){
                    System.out.println("Algo deu errado:");
                }
                break;

        }
    }

    private void menu() {
        System.out.println("Selecione uma ação:");
        System.out.println("0. Registrar Membros");
        System.out.println("1. Trocar Horário do Sistema");
        System.out.println("2. Postar Mensagem");
        System.out.println("3. Remover Membro");
        System.out.println("4. Gerar Relatório");
        }

    private static void criarNota(Map<String, Membro> itemMap) throws Exception{
        FileWriter fileWriter = new FileWriter("arquivo_super_Secreto_nao_abrir.csv",true);
        fileWriter.write("=== Membros ==="+"\n");
        fileWriter.append("Total de Membros atualmente:" + itemMap.size()+"\n");
        fileWriter.append("Membros:"+"\n");
        for (Map.Entry<String, Membro> entry : itemMap.entrySet()) {
            String chave = entry.getKey();
            Membro valor = entry.getValue();
            fileWriter.append(valor.getTipoMembro() + ";" + valor.getNome() + ";" + chave + "\n");
        }
        //Fechar o arquivo e salva as mudanças
        fileWriter.close();
    }
    }

