package Pessoa;

import java.util.ArrayList;
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

    public Equipe(int CodEquipe, String Nome, Tecnico tecnico, String Divisao, int Pontuacao, int TotalVitorias, int TotalDerrotas){
        Random r = new Random();
        this.CodEquipe = r.nextInt(20);
        this.Nome = Nome;
        this.tecnico = tecnico;
        this.Divisao = Divisao;
        this.Pontuacao = Pontuacao;
        this.TotalVitorias = TotalVitorias;
        this.TotalDerrotas = TotalDerrotas;
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

    public void atribuirTecnico(){

    }

    public void atribuirJogador(String Nome, int CPF, String Telefone, String Funcao, String Email, int CodJogador, String Posicao, int TotalCartoesVermelho, int TotalCartoesAmarelo, String Cartoes, boolean Titular, int TotalGols){
        Jogador jogador = new Jogador(Nome, CPF, Telefone, Funcao, Email, CodJogador, Posicao, TotalCartoesVermelho, TotalCartoesAmarelo, Cartoes, Titular, TotalGols);
        Jogadores.add(jogador);
        System.out.println("O Jogador " + jogador.getNome() + "foi contratado pelo " + this.Nome);
    }
    
}
