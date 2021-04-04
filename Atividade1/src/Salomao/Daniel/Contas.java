
//Daniel Coimbra Salomão 19.02177-0
//Andre Bonito Saad 18.01391-0

package Salomao.Daniel;

public class Contas {


    static int idAtual = 0;

    {
        idAtual += 1;
    }


    public Usuarios getUsuarios() {
        return usuarios;
    }

    public int getidConta() {
        return idConta;
    }

    private int idConta;
    private double saldo;
    private Usuarios usuarios;

    public Contas(String nome, double saldoInicial) {
        this.saldo = saldoInicial;
        this.usuarios = new Usuarios(nome);
        this.idConta = idAtual;
    }

    public double getSaldo() {

        return this.saldo;
    }

    //operações necessarias para funcionamento

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirDinheiro(Contas destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "" + usuarios.toString() +
                " - Saldo: " + saldo;

    }
}
