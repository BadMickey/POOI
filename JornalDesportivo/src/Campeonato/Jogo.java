package Campeonato;

public class Jogo {
    private int CodJogo;
    private String Estadio;
    private String Data;
    private String Horario;
    private Equipe TimeCasa;
    private Equipe TimeVisitante;
    private String Arbitro;
    private int GolsCasa;
    private int GolsVisitante;

    public Jogo(int CodJogo, String Estadio, String Data, String Horario, Equipe TimeCasa, Equipe TimeVisitante,
            String Arbitro, int GolsCasa, int GolsVisitante) {
        this.CodJogo = CodJogo;
        this.Estadio = Estadio;
        this.Data = Data;
        this.Horario = Horario;
        this.TimeCasa = TimeCasa;
        this.TimeVisitante = TimeVisitante;
        this.Arbitro = Arbitro;
        this.GolsCasa = GolsCasa;
        this.GolsVisitante = GolsVisitante;
    }

    public int getCodJogo() {
        return CodJogo;
    }

    public void setCodJogo(int codJogo) {
        CodJogo = codJogo;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String estadio) {
        Estadio = estadio;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public Equipe getTimeCasa() {
        return TimeCasa;
    }

    public void setTimeCasa(Equipe timeCasa) {
        TimeCasa = timeCasa;
    }

    public Equipe getTimeVisitante() {
        return TimeVisitante;
    }

    public void setTimeVisitante(Equipe timeVisitante) {
        TimeVisitante = timeVisitante;
    }

    public String getArbitro() {
        return Arbitro;
    }

    public void setArbitro(String arbitro) {
        Arbitro = arbitro;
    }

    public int getGolsCasa() {
        return GolsCasa;
    }

    public void setGolsCasa(int golsCasa) {
        GolsCasa = golsCasa;
    }

    public int getGolsVisitante() {
        return GolsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        GolsVisitante = golsVisitante;
    }

    public void GolCasa(){

    }

    public void GolVisitante(){
        
    }

}
