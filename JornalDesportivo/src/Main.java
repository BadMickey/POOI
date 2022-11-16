import Pessoa.*;
import Campeonato.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Campeonatos camp = new Campeonatos(1, "20/11/2022", "13:00", null, null);

        camp.adicionarEquipes(1, "ET's de Varginha", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(2, "União Flasco", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(3, "Vasco O gigante", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(4, "Palmeiras sem mundiais", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(5, "Barcelona", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(6, "Real Madrid", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(7, "Paris Saint Germain", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(8, "Urubus do flamengo", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(9, "Gaviões da Fiel", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(10, "Nautico", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(11, "Tropa do Prior", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(12, "Cruzeiro", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(13, "São Paulo", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(14, "Goiás", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(15, "Atlético", null, null, 0, null, null, null, 0, 0, false, false, false);
        camp.adicionarEquipes(16, "Santos", null, null, 0, null, null, null, 0, 0, false, false, false);

        camp.getEquipes().get(0).atribuirTecnico("Maicão", "11122233340", "62997841245", "Técnico",
                "maicao1245@gmail.com", 0, 1);

        camp.getEquipes().get(0).atribuirJogador("Edinaldo", "07544433320", "62995443241", "Jogador",
                "ednaldo15@gmai.com", 1, "Atacante", 0, 0, true);

    }
}
