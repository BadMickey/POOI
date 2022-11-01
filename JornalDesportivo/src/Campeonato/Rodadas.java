package Campeonato;

import java.util.ArrayList;

public class Rodadas {
    private int CodRodada;
    public List<Equipe> Final = new ArrayList<>();
    public List<Equipe> SemiFinal = new ArrayList<>();
    public List<Equipe> Quartas = new ArrayList<>();
    public List<Equipe> Inicial = new ArrayList<>();
    private String Data;

    public int getCodRodada() {
        return CodRodada;
    }

    public void setCodRodada(int codRodada) {
        CodRodada = codRodada;
    }

    public List<Equipe> getFinal() {
        return Final;
    }

    public void setFinal(List<Equipe> final1) {
        Final = final1;
    }

    public List<Equipe> getSemiFinal() {
        return SemiFinal;
    }

    public void setSemiFinal(List<Equipe> semiFinal) {
        SemiFinal = semiFinal;
    }

    public List<Equipe> getQuartas() {
        return Quartas;
    }

    public void setQuartas(List<Equipe> quartas) {
        Quartas = quartas;
    }

    public List<Equipe> getInicial() {
        return Inicial;
    }

    public void setInicial(List<Equipe> inicial) {
        Inicial = inicial;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

}
