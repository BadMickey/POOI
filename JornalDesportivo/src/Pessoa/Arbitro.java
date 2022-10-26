package Pessoa;

import java.util.Random;


public class Arbitro extends Pessoa{

    private int CodArbitro;
    private int Cartoes;
    private int Jogos;
    
    public Arbitro(String Nome, int CPF, String Telefone, String Funcao, String Email, int CodArbitro, int Cartoes, int Jogos) {
        super(Nome, CPF, Telefone, Funcao, Email);
        this.CodArbitro = CodArbitro;
        this.Cartoes = Cartoes;
        this.Jogos = Jogos;
    }

    public void apitar(){
        System.out.println("*O Arbitro apita e a partida começa");
    }
    
    public void cartaoVermelho(Jogador jogador){
        System.out.println("Arbitro: *Apita*");
        System.out.println("Arbitro: *Entrega o cartão vermelho para o jogador*");
        System.out.println("O jogador " + jogador.getNome() + "Recebeu o cartão vermelho e está expulso.");
        jogador.setTotalCartoesVermelho(jogador.getTotalCartoesVermelho()+1);
        jogador.setTitular(false);
    }
    public void cartaoAmarelo(Jogador jogador){
        System.out.println("Arbitro: *Apita*");
        System.out.println("Arbitro: *Entrega o cartão amarelo para o jogador*");
        System.out.println("O jogador " + jogador.getNome() + "Recebeu o cartão Amarelo.");
        jogador.setTotalCartoesAmarelo(jogador.getTotalCartoesAmarelo()+1);
        if(jogador.getTotalCartoesVermelho() == 2){
            System.out.println("O Jogador " + jogador.getNome() + "recebeu dois cartões e está fora do jogo.\n");
            jogador.setTitular(false);
        }
    }

    public int getCodArbitro() {
        return CodArbitro;
    }
    public void setCodArbitro(int codArbitro) {
        CodArbitro = codArbitro;
    }
    public int getCartoes() {
        return Cartoes;
    }
    public void setCartoes(int cartoes) {
        Cartoes = cartoes;
    }
    public int getJogos() {
        return Jogos;
    }
    public void setJogos(int jogos) {
        Jogos = jogos;
    }
}
