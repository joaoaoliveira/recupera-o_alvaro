import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criar sistema de gerenciamento de reservas
        GerenciamentoReservas sistemaReservas = new GerenciamentoReservas();

        // Criar eventos
        try {
            // Criar um palestrante
            Participante palestrante = new Participante("João", "joao@exemplo.com", TipoParticipante.VIP);

            // Criar uma palestra
            Palestra palestra = new Palestra("Palestra Java", LocalDate.parse("2024-10-20"), "Sala A", 2, palestrante, 60, "Java Avançado");
            sistemaReservas.adicionarEvento(palestra);

            // Criar participantes
            Participante participante1 = new Participante("Pedro", "pedro@exemplo.com", TipoParticipante.NORMAL);
            Participante participante2 = new Participante("Ana", "ana@exemplo.com", TipoParticipante.VIP);
            Participante participanteDuplicado = new Participante("Pedro", "pedro@exemplo.com", TipoParticipante.NORMAL);

            // Adicionar reservas
            sistemaReservas.adicionarReserva(palestra, participante1); // Sucesso
            sistemaReservas.adicionarReserva(palestra, participanteDuplicado); // Tentativa de duplicado
            sistemaReservas.adicionarReserva(palestra, participante2); // Sucesso

            // Listar reservas de um evento
            sistemaReservas.listarReservas(palestra);

            // Criar relatórios
            Relatorios relatorios = new Relatorios(sistemaReservas);
            relatorios.gerarRelatorioEventos();
            relatorios.listarParticipantesEvento(palestra);
            relatorios.listarParticipantesVIP();
        } catch (EventoLotadoException | ParticipanteDuplicadoException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de argumento: " + e.getMessage());
        }
    }
}
