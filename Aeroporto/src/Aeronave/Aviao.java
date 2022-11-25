package Aeronave;

import java.util.ArrayList;

import Aeronave.*;
import Pessoas.Funcionario;

public class Aviao {
    private int Id;
    private int QtdVoos;
    private String Modelos;
    public ArrayList<Funcionario> Tripulacao;
    public int Assentos;
    private String Compania;

    public Aviao(int Id, int QtdVoos, String Modelos, ArrayList Tripulacao, int Assentos, String Compania){
        this.Id = Id;
        this.QtdVoos = QtdVoos;
        this.Modelos = Modelos;
        this.Tripulacao = Tripulacao;
        this.Assentos = Assentos;
        this.Compania = Compania;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getQtdVoos() {
        return QtdVoos;
    }

    public void setQtdVoos(int qtdVoos) {
        this.QtdVoos = qtdVoos;
    }

    public String getModelos() {
        return Modelos;
    }

    public void setModelos(String modelos) {
        this.Modelos = modelos;
    }

    public List<Funcionario> getTripulacao() {
        return Tripulacao;
    }

    public void setTripulacao(List<Funcionario> tripulacao) {
        this.Tripulacao = tripulacao;
    }

    public int getAssentos() {
        return Assentos;
    }

    public void setAssentos(int assentos) {
        this.Assentos = assentos;
    }

    public String getCompania() {
        return Compania;
    }

    public void setCompania(String compania) {
        this.Compania = compania;
    }

}
