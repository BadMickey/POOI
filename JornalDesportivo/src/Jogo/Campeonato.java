package Jogo;

import java.util.ArrayList;
import java.util.Random;

import javax.xml.crypto.Data;

public class Campeonato {

    private int CodCamp;
    private String Data;
    private String Hora;
    public List<Equipe> equipes = new ArrayList<>();
    private int Rodadas;

    public Campeonato(int CodCamp, String Data, String Hora, int Rodadas) {
        Random r = new Random();
        this.CodCamp = r.nextInt(20);
        this.Data = Data;
        this.Rodadas = Rodadas;
    }

}
