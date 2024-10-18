public class Relatorios {
    private GerenciamentoReservas sistemaReservas;

    public Relatorios(GerenciamentoReservas sistemaReservas) {
        this.sistemaReservas = sistemaReservas;
    }

    // Gera um relatório com todos os eventos
    public void gerarRelatorioEventos() {
        System.out.println("Relatório de Eventos:");
        for (Evento evento : sistemaReservas.getListaEventos()) {
            System.out.println("Evento: " + evento.getNome() + " - Data: " + evento.getData());
        }
    }

    // Lista todos os participantes de um determinado evento
    public void listarParticipantesEvento(Evento evento) {
        System.out.println("Participantes do evento " + evento.getNome() + ":");
        for (Participante participante : evento.getParticipantes()) {
            System.out.println(participante.getNome() + " - " + participante.getEmail() + " - " + participante.getTipo());
        }
    }

    // Lista todos os participantes do tipo VIP de todos os eventos
    public void listarParticipantesVIP() {
        System.out.println("Lista de Participantes VIP:");
        for (Evento evento : sistemaReservas.getListaEventos()) {
            for (Participante participante : evento.getParticipantes()) {
                if (participante.getTipo() == TipoParticipante.VIP) {
                    System.out.println(participante.getNome() + " - " + participante.getEmail());
                }
            }
        }
    }
}
