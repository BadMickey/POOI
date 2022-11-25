package Voo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Voo.*;
import Pessoas.*;
import Aeronave.*;

public class Voo implements Intercace_voo{
    private int id;
    private String Partida;
    private String Chegada;
    private String Rota;
    private ArrayList<Passageiro> Passageiros;;

    public Voo(int id, String Partida, String Chegada, String Rota, ArrayList Passageiros){
        this.id = id;
        this.Partida = Partida;
        this.Chegada = Chegada;
        this.Rota = Rota;
        this.Passageiros = Passageiros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartida() {
        return Partida;
    }

    public void setPartida(String partida) {
        this.Partida = partida;
    }

    public String getChegada() {
        return Chegada;
    }

    public void setChegada(String chegada) {
        this.Chegada = chegada;
    }
    
    public String getRota() {
        return Rota;
    }

    public void setRota(String rota) {
        this.Rota = rota;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return Passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.Passageiros = passageiros;
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }

    public void historicoVoos(ArrayList<Voo> voos){
        for(Voo voo : voos){
            System.out.println(voo.toString());
        }
    }

    @Override
    public String toString(){
        return "\nID: " +getId()+ " | Data da Partida: " +getPartida()+ " | Data de Chegada: " +getChegada()+ " | Rota: " +getRota();
    }
}
