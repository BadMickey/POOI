package Jogo;

import java.util.ArrayList;
import java.util.Random;

import Campeonato.Rodadas;

public class Campeonato {

    private int CodCamp;
    private String Data;
    private String Hora;
    public List<Equipe> equipes = new ArrayList<>();
    private Rodadas Rodada;

    public Campeonato(int CodCamp, String Data, String Hora, Rodadas Rodada, List<Equipe> equipes) {
        Random r = new Random();
        this.CodCamp = r.nextInt(20);
        this.Data = Data;
        this.Rodada = Rodada;
        this.equipes = equipes;
    }

    public int getCodCamp() {
        return CodCamp;
    }

    public void setCodCamp(int codCamp) {
        CodCamp = codCamp;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    public int getRodada() {
        return Rodada;
    }

    public void setRodada(Rodadas Rodada) {
        Rodada = rodada;
    }

    public void GerarChaves(List<Equipe> equipes) {

    }
}
