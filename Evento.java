import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private LocalDate data;
    private String local;
    private int capacidadeMaxima;
    private List<Participante> participantes;

    public Evento(String nome, LocalDate data, String local, int capacidadeMaxima) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Participante participante) throws ParticipanteDuplicadoException, EventoLotadoException {
        if (participantes.contains(participante)) {
            throw new ParticipanteDuplicadoException("Participante " + participante.getNome() + " já está registrado no evento.");
        }
        if (participantes.size() >= capacidadeMaxima) {
            throw new EventoLotadoException("O evento " + nome + " já atingiu sua capacidade máxima.");
        }
        participantes.add(participante);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
