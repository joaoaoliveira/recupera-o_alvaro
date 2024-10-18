public class Participante {
    private String nome;
    private String email;
    private TipoParticipante tipo;

    public Participante(String nome, String email, TipoParticipante tipo) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public TipoParticipante getTipo() {
        return tipo;
    }
}
