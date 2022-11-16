package Campeonato;

import java.util.ArrayList;
import java.util.Random;

import Pessoa.*;
import Campeonato.*;

public class Campeonatos {

    private int CodCamp;
    private String Data;
    private String Hora;
    public List<Equipe> equipes = new ArrayList<>();
    public List<Arbitro> arbitros = new ArrayList<>();
    private Rodadas Rodada;

    public Campeonatos(int CodCamp, String Data, String Hora, Rodadas Rodada, List equipes) {
        Random r = new Random();
        this.CodCamp = CodCamp;
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

    public int getRodada() {
        return Rodada;
    }

    public void setRodada(Rodadas Rodada) {
        Rodada = rodada;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    public void adicionarEquipes(int CodEquipe, String Nome, Tecnico tecnico, String Divisao, int Pontuacao,
            List Jogadores,
            List Titulares, List Reservas, int TotalVitorias,
            int TotalDerrotas, boolean Divisa1, boolean Divisa2, boolean Regional) {
        Equipe eqp = new Equipe(CodEquipe, Nome, null, Divisao, Pontuacao, null, null, null, TotalVitorias,
                TotalDerrotas, Divisa1, Divisa2, Regional);
        equipes.add(eqp);
    }

    public void adicionarArbitros(String Nome, int CPF, String Telefone, String Funcao, String Email, int CodArbitro,
            int Cartoes, int Jogos) {
        Arbitro abr = new Arbitro(Nome, CPF, Telefone, Funcao, Email, CodArbitro, Cartoes, Jogos);
        arbitros.add(abr);
    }

}
