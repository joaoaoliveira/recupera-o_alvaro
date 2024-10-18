import java.time.LocalDate; // Import necessário para LocalDate
import java.util.ArrayList;
import java.util.List;

public class ListaEventos {
    private List<Evento> eventos;

    public ListaEventos() {
        this.eventos = new ArrayList<>();
    }

    // Adicionar um evento à lista
    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Listar todos os eventos
    public List<Evento> listarEventos() {
        return eventos;
    }

    // Filtrar eventos por tipo
    public List<Evento> filtrarEventosPorTipo(Class<? extends Evento> tipo) {
        List<Evento> eventosFiltrados = new ArrayList<>();
        for (Evento evento : eventos) {
            if (tipo.isInstance(evento)) {
                eventosFiltrados.add(evento);
            }
        }
        return eventosFiltrados;
    }

    // Filtrar eventos por data
    public List<Evento> filtrarEventosPorData(LocalDate data) {
        List<Evento> eventosFiltrados = new ArrayList<>();
        for (Evento evento : eventos) {
            if (evento.getData().isEqual(data)) {
                eventosFiltrados.add(evento);
            }
        }
        return eventosFiltrados;
    }

    // Método para obter o número total de eventos
    public int obterNumeroTotalEventos() {
        return eventos.size();
    }
}
