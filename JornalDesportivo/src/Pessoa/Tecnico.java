package Pessoa;

import java.util.Random;

public class Tecnico extends Pessoa {

    private int Jogos;
    private int CodTecnico;

    public Tecnico(String Nome, int CPF, String Telefone, String Funcao, String Email, int Jogos, int CodTecnico) {
        super(Nome, CPF, Telefone, Funcao, Email);
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Jogos = Jogos;
        this.CodTecnico = CodTecnico;
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

}
