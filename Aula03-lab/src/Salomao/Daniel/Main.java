package Salomao.Daniel;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quase 5 temporada ai!");
	// Criar conta
        Conta c1;
    //Instanciar um objeto
        c1 = new Conta();
        c1.cliente =  new Cliente();

        c1.cliente.titular = "Inuyasha";
        c1.saldo = 199.99;

        c1.visualizarSalto();
        c1.visualizarSalto();

        Conta c2 = new Conta();
        c2.cliente.titular = "Seichomaru";
        c2.saldo = 1000;
        c2.visualizarSalto();

        c1.depositar(20);
        c2.depositar(35.99);

        c1.visualizarSalto();
        c2.visualizarSalto();

        if(c1.sacar(100)){
            System.out.println("Deu Bom!");
        }else{
            System.out.println("Deu ruim!");
        }
        c1.visualizarSalto();

        if(c1.transferirPara(100, c2)){
            System.out.println("Deu Bom! Transferiu!");
        }else{
            System.out.println("Deu Ruim! Não Transferiu!");
        }
        c1.visualizarSalto();
        c2.visualizarSalto();

        System.out.println("C1" + c1.toString());
        System.out.println("C2" + c2.toString());

    }
}
