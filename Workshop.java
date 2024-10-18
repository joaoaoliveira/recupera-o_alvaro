import java.time.LocalDate;

public class Workshop extends Evento {
    private String instrutor;
    private String materiaisNecessarios;
    private int cargaHoraria;

    public Workshop(String nomeEvento, LocalDate data, String local, int capacidadeMaxima, String instrutor, String materiaisNecessarios, int cargaHoraria) {
        super(nomeEvento, data, local, capacidadeMaxima);  // Chama o construtor correto da classe Evento
        this.instrutor = instrutor;
        this.materiaisNecessarios = materiaisNecessarios;
        this.cargaHoraria = cargaHoraria;
    }

    // Getters e Setters
    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public String getMateriaisNecessarios() {
        return materiaisNecessarios;
    }

    public void setMateriaisNecessarios(String materiaisNecessarios) {
        this.materiaisNecessarios = materiaisNecessarios;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Exibir detalhes do Workshop
    public void exibirDetalhes() {
        System.out.println("Workshop: " + getNome());
        System.out.println("Instrutor: " + instrutor);
        System.out.println("Materiais Necessários: " + materiaisNecessarios);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
    }

    @Override
    public String toString() {
        return "Workshop: " + getNome() + "\nInstrutor: " + instrutor + 
               "\nMateriais Necessários: " + materiaisNecessarios + 
               "\nCarga Horária: " + cargaHoraria + " horas";
    }
}
