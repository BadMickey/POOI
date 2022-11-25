package Voo;

import Aeronave.*;
import Voo.*;

import java.util.ArrayList;

public class Aeroporto {
    private int Id;
    private String Nome;
    public ArrayList<Aviao> Avioes;
    public ArrayList<Voo> Voos;

    public Aeroporto(int Id, String Nome, ArrayList Avioes, ArrayList Voos){
        this.Id = Id;
        this.Nome = Nome;
        this.Avioes = Avioes;
        this.Voos = Voos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public ArrayList<Aviao> getAvioes() {
        return Avioes;
    }

    public void setAvioes(ArrayList<Aviao> avioes) {
        this.Avioes = avioes;
    }

    public ArrayList<Voo> getVoos() {
        return Voos;
    }

    public void setVoos(ArrayList<Voo> voos) {
        this.Voos = voos;
    }

}
