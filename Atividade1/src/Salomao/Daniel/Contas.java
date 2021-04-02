package Salomao.Daniel;


public class Contas {
    public static Object receber;
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

    //public String receber(double valor, Contas conta){
    //    return "FOI KRL;" + conta.idConta;
    //}

    @Override
    public String toString() {
        return "" + usuarios.toString() +
                " - Saldo: " + saldo;

    }
}
