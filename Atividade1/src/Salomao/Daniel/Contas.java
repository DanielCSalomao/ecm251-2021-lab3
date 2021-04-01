package Salomao.Daniel;

public class Contas {
    static int idAtual = 0;

    {
        idAtual += 1;
    }

    public Usuarios getClientes() {
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

    @Override
    public String toString() {
        return "" + usuarios.toString() +
                " - Saldo: " + saldo;

    }
}
