import java.util.ArrayList;

import Aeronave.*;
import Pessoas.*;
import Voo.*;

public class App {
    public static void main(String[] args) throws Exception {

        //Bagagens--------------------------------------
        ArrayList<Bagagem> Bagagens1 = new ArrayList<>();
        Bagagens1.add(new Bagagem(0, 20));
        Bagagens1.add(new Bagagem(1, 15));

        //Passageiros-----------------------------------
        ArrayList<Passageiro> Passageiros1 = new ArrayList<>();
        Passageiros1.add(new Passageiro("07592691140", "Vini", "vini123@gmail.com", "62998453833", "23/01/1994", "5474123", Bagagens1));

        //Tripulacao------------------------------------
        ArrayList<Funcionario> tripulacao1 = new ArrayList<>();
        tripulacao1.add(new Funcionario("45756712140", "Irineu", "irineu124@gmail.com", "6299448826", "14/01/1985", 0, "Piloto", false, true, false));
        tripulacao1.add(new Funcionario("14512478430", "Vandiclei", "vandiclei124@gmail.com", "648789511023", "19/04/1998", 1, "Co-Piloto", true, false, false));
        tripulacao1.add(new Funcionario("45478954123", "Ana", "ana124@gmail.com", "6154894699", "25/04/1993", 2, "Aeromoça", false, false, true));

        //Aviões----------------------------------------
        ArrayList<Aviao> Avioes1 = new ArrayList<>();
        Avioes1.add(new Aviao(1, 0, Modelo.BOEING_727.getModelos(), tripulacao1, 20, "GOL"));
        
        
        ArrayList<Voo> voos = new ArrayList<>();
        voos.add(new Voo(1, "23/11/2022 - 19:00", "24/11/2022 - 08:00", "SP - RJ", Passageiros1));


        Aeroporto aeroporto = new Aeroporto(1, "Congonha", Avioes1, voos);

        int auxiliar = aeroporto.getAvioes().get(0).getAssentos();
        
        aeroporto.getAvioes().get(0).setAssentos(auxiliar - Passageiros1.size());

        voos.get(0).historicoVoos(voos);

    }
}
