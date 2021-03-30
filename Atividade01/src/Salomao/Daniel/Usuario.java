package Salomao.Daniel;

public class Usuario {

    public Usuario(String nome){
        this.nome = nome;
    }

    private String nome;
    private String senha;
    private String email;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
