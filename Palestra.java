import java.time.LocalDate;

public class Palestra extends Evento {
    private int duracao; // Duração em minutos
    private String tema;
    private Participante palestrante;

    public Palestra(String nome, LocalDate data, String local, int capacidadeMaxima, Participante palestrante, int duracao, String tema) {
        super(nome, data, local, capacidadeMaxima);
        this.palestrante = palestrante;
        this.duracao = duracao;
        this.tema = tema;
    }

    public Participante getPalestrante() {
        return palestrante;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getTema() {
        return tema;
    }
}
