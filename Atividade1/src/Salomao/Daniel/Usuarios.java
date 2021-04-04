
//Daniel Coimbra Salomão 19.02177-0
//Andre Bonito Saad 18.01391-0


package Salomao.Daniel;

public class Usuarios {

    private String nome;
    private String senha;
    private String email;

    public Usuarios(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "" + nome;
    }
}
