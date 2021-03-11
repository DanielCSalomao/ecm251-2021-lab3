package Salomao.Daniel;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quase 5 temporada ai!");
	// Criar conta
        Conta c1;
    //Instanciar um objeto
        c1 = new Conta();

        c1.depositar(300);
        c1.sacar(250);
        c1.visualizarSalto();

    }
}
