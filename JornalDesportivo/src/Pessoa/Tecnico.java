package Pessoa;

import java.util.Random;
import java.util.random;

public class Tecnico extends Pessoa {

    private int Jogos;
    private int CodTecnico;
    public Equipe equipe;

    public Tecnico(String Nome, int CPF, String Telefone, String Funcao, String Email, int Jogos, int CodTecnico,
            Equipe equipe) {
        super(Nome, CPF, Telefone, Funcao, Email);
        Random r = new Random();
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Jogos = Jogos;
        this.CodTecnico = r.nextInt(20);
        this.equipe = equipe;
    }

    public int getJogos() {
        return Jogos;
    }

    public void setJogos(int jogos) {
        Jogos = jogos;
    }

    public int getCodTecnico() {
        return CodTecnico;
    }

    public void setCodTecnico(int codTecnico) {
        CodTecnico = codTecnico;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

}
