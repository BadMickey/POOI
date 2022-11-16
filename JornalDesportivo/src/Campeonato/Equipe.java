package Campeonato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Equipe {

    private int CodEquipe;
    private String Nome;
    private Tecnico tecnico;
    private String Divisao;
    private int Pontuacao;
    public List<Jogador> Jogadores = new ArrayList<>();
    public List<Jogador> Titulares = new ArrayList<>();
    public List<Jogador> Reservas = new ArrayList<>();
    private int TotalVitorias;
    private int TotalDerrotas;
    private boolean Divisa1;
    private boolean Divisa2;
    private boolean Regional;

    public Equipe(int CodEquipe, String Nome, Tecnico tecnico, String Divisao, int Pontuacao, List Jogadores,
            List Titulares, List Reservas, int TotalVitorias,
            int TotalDerrotas, boolean Divisa1, boolean Divisa2, boolean Regional) {
        this.CodEquipe = CodEquipe;
        this.Nome = Nome;
        this.tecnico = tecnico;
        this.Divisao = Divisao;
        this.Pontuacao = Pontuacao;
        this.Jogadores = Jogadores;
        this.Titulares = Titulares;
        this.Reservas = Reservas;
        this.TotalVitorias = TotalVitorias;
        this.TotalDerrotas = TotalDerrotas;
        this.Divisa1 = Divisa1;
        this.Divisa2 = Divisa2;
        this.Regional = Regional;
    }

    public int getCodEquipe() {
        return CodEquipe;
    }

    public void setCodEquipe(int codEquipe) {
        CodEquipe = codEquipe;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String getDivisao() {
        return Divisao;
    }

    public void setDivisao(String divisao) {
        Divisao = divisao;
    }

    public int getPontuacao() {
        return Pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        Pontuacao = pontuacao;
    }

    public int getTotalVitorias() {
        return TotalVitorias;
    }

    public void setTotalVitorias(int totalVitorias) {
        TotalVitorias = totalVitorias;
    }

    public int getTotalDerrotas() {
        return TotalDerrotas;
    }

    public void setTotalDerrotas(int totalDerrotas) {
        TotalDerrotas = totalDerrotas;
    }

    public boolean isDivisa1() {
        return Divisa1;
    }

    public void setDivisa1(boolean divisa1) {
        Divisa1 = divisa1;
    }

    public boolean isDivisa2() {
        return Divisa2;
    }

    public void setDivisa2(boolean divisa2) {
        Divisa2 = divisa2;
    }

    public boolean isRegional() {
        return Regional;
    }

    public void setRegional(boolean regional) {
        Regional = regional;
    }

    public void atribuirTecnico(String Nome, String CPF, String Telefone, String Funcao, String Email, int Jogos,
            int CodTecnico) {
        Tecnico tecnico = new Tecnico(Nome, CPF, Telefone, Funcao, Email, Jogos, CodTecnico);
        System.out.println("O técnico " + tecnico.getNome() + "foi contratado pelo " + this.Nome);
    }

    public void atribuirJogador(String Nome, String CPF, String Telefone, String Funcao, String Email, int CodJogador,
            String Posicao, int TotalCartoesVermelho, int TotalCartoesAmarelo, boolean Titular,
            int TotalGols) {
        Jogador jogador = new Jogador(Nome, CPF, Telefone, Funcao, Email, CodJogador, Posicao, TotalCartoesVermelho,
                TotalCartoesAmarelo, Titular, TotalGols);
        if (jogador.isTitular() == True) {
            Jogadores.add(jogador);
            Titulares.add(jogador);
            System.out.println("O Jogador " + jogador.getNome() + "foi contratado pelo " + this.Nome + "como titular");
        } else {
            Jogadores.add(jogador);
            Reservas.add(jogador);
            System.out.println("O Jogador " + jogador.getNome() + "foi contratado pelo " + this.Nome + "como reserva");
        }
    }
}
