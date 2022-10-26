package Pessoa;

import java.util.Random;

public class Jogador extends Pessoa{
    
    private int CodJogador;
    private String Posicao;
    private int TotalCartoesVermelho;
    private int TotalCartoesAmarelo;
    private boolean Titular;
    private int TotalGols;

    public Jogador(String Nome, int CPF, String Telefone, String Funcao, String Email, int CodJogador, String Posicao, int TotalCartoesVermelho, int TotalCartoesAmarelo, String Cartoes, boolean Titular, int TotalGols) {
        super(Nome, CPF, Telefone, Funcao, Email);
        Random r = new Random();
        this.CodJogador = r.nextInt(20);
        this.Posicao = Posicao;
        this.Cartoes = Cartoes;
        this.TotalCartoesVermelho = TotalCartoesVermelho;
        this.TotalCartoesAmarelo = TotalCartoesAmarelo;
        this.Titular = Titular;
        this.TotalGols = TotalGols;
    }


    public int getCodJogador() {
        return CodJogador;
    }

    public void setCodJogador(int codJogador) {
        CodJogador = codJogador;
    }

    public String getPosicao() {
        return Posicao;
    }

    public void setPosicao(String posicao) {
        Posicao = posicao;
    }

    public int getTotalCartoesVermelho() {
        return TotalCartoesVermelho;
    }

    public void setTotalCartoesVermelho(int totalCartoesVermelho) {
        TotalCartoesVermelho = totalCartoesVermelho;
    }

    public int getTotalCartoesAmarelo() {
        return TotalCartoesAmarelo;
    }

    public void setTotalCartoesAmarelo(int totalCartoesAmarelo) {
        TotalCartoesAmarelo = totalCartoesAmarelo;
    }

    public boolean isTitular() {
        return Titular;
    }

    public void setTitular(boolean titular) {
        Titular = titular;
    }

    public int getTotalGols() {
        return TotalGols;
    }

    public void setTotalGols(int totalGols) {
        TotalGols = totalGols;
    }
}
