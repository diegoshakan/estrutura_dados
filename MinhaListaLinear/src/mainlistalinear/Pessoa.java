package mainlistalinear;
public class Pessoa {
    private String nome;
    private String telefone;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
}

