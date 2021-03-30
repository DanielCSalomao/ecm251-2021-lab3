package Salomao.Daniel;

public class Conta {

    public Usuario getUsuario() {
        return usuario;
    }

    public int getNumero() {
        return numero;
    }

    //Atributos das classe
    private Usuario usuario;
    private double saldo;
    private int numero;

    //Métodos da classe

    //Construtor da classe
    public Conta(String nomeUsuario, double saldoInicial){
        this.saldo = saldoInicial;
        this.usuario = new Usuario(nomeUsuario);
        this.numero = 1234;
    }
    public Conta(String nomeUsuario, String cpf){
        this.usuario = new Usuario(nomeUsuario);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor) {
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }


    public void visualizarSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + usuario.toString() +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}
