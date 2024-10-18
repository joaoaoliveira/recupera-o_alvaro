import java.util.ArrayList;
import java.util.List;

public class GerenciamentoReservas {
    private List<Evento> listaEventos;

    public GerenciamentoReservas() {
        this.listaEventos = new ArrayList<>();
    }

    // Método para adicionar um evento à lista de eventos
    public void adicionarEvento(Evento evento) {
        listaEventos.add(evento);
    }

    // Método para adicionar uma reserva (participante) em um evento
    public void adicionarReserva(Evento evento, Participante participante) throws ParticipanteDuplicadoException, EventoLotadoException {
        evento.adicionarParticipante(participante);
    }

    // Método para listar reservas (participantes) de um evento
    public void listarReservas(Evento evento) {
        System.out.println("Reservas para o evento: " + evento.getNome());
        for (Participante participante : evento.getParticipantes()) {
            System.out.println("Nome: " + participante.getNome() + ", Tipo: " + participante.getTipo());
        }
    }

    // Getter para a lista de eventos
    public List<Evento> getListaEventos() {
        return listaEventos;
    }
}
