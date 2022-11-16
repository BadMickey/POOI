package Campeonato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rodadas {
    private int CodRodada;
    public List<Equipe> Final = new ArrayList<>();
    public List<Equipe> SemiFinal = new ArrayList<>();
    public List<Equipe> Quartas = new ArrayList<>();
    public List<Equipe> Inicial = new ArrayList<>();
    private String Data;
    private Boolean Iniciado = false;

    public int getCodRodada() {
        return CodRodada;
    }

    public void setCodRodada(int codRodada) {
        CodRodada = codRodada;
    }

    public List<Equipe> getFinal() {
        return Final;
    }

    public void setFinal(List<Equipe> final1) {
        Final = final1;
    }

    public List<Equipe> getSemiFinal() {
        return SemiFinal;
    }

    public void setSemiFinal(List<Equipe> semiFinal) {
        SemiFinal = semiFinal;
    }

    public List<Equipe> getQuartas() {
        return Quartas;
    }

    public void setQuartas(List<Equipe> quartas) {
        Quartas = quartas;
    }

    public List<Equipe> getInicial() {
        return Inicial;
    }

    public void setInicial(List<Equipe> inicial) {
        Inicial = inicial;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public void GerarChaves(List<Equipe> equipes, Boolean Iniciado) {
        if (Inicial.size() == 16 && Iniciado == false) {
            for (Equipe value : equipes) {
                Inicial.add(value);
            }
            Iniciado = true;
        } else {
            System.out.println("Não há times suficientes para iniciar as chaves ou já foram iniciadas!");
        }
        if (Inicial.size() > 0 && Inicial.size() == 16) {
            Collections.shuffle(Inicial);

            System.out.println("Gerando chaves da fase de grupos!");
            List<Jogo> JogosIni1 = new ArrayList<Jogo>();
            JogosIni1.add(
                    new Jogo(1, "Mané Garrincha", "20/11/2022", "08:00", Inicial.get(0), Inicial.get(1), "a", 0, 0));
            List<Jogo> JogosIni2 = new ArrayList<Jogo>();
            JogosIni2.add(
                    new Jogo(2, "Mané Garrincha", "20/11/2022", "11:00", Inicial.get(2), Inicial.get(3), "a", 0, 0));
            List<Jogo> JogosIni3 = new ArrayList<Jogo>();
            JogosIni3.add(
                    new Jogo(3, "Mané Garrincha", "20/11/2022", "13:00", Inicial.get(4), Inicial.get(5), "a", 0, 0));
            List<Jogo> JogosIni4 = new ArrayList<Jogo>();
            JogosIni4.add(
                    new Jogo(4, "Mané Garrincha", "20/11/2022", "15:00", Inicial.get(6), Inicial.get(7), "a", 0, 0));
            List<Jogo> JogosIni5 = new ArrayList<Jogo>();
            JogosIni5.add(
                    new Jogo(5, "Mané Garrincha", "20/11/2022", "17:00", Inicial.get(8), Inicial.get(9), "a", 0, 0));
            List<Jogo> JogosIni6 = new ArrayList<Jogo>();
            JogosIni6.add(
                    new Jogo(6, "Mané Garrincha", "20/11/2022", "19:00", Inicial.get(10), Inicial.get(11), "a", 0, 0));
            List<Jogo> JogosIni7 = new ArrayList<Jogo>();
            JogosIni7.add(
                    new Jogo(7, "Mané Garrincha", "20/11/2022", "21:00", Inicial.get(12), Inicial.get(13), "a", 0, 0));
            List<Jogo> JogosIni8 = new ArrayList<Jogo>();
            JogosIni8.add(
                    new Jogo(8, "Serra Dourada", "20/11/2022", "21:00", Inicial.get(14), Inicial.get(15), "a", 0, 0));
        }
        if (Inicial.size() == 0 && Quartas.size() > 0 && Quartas.size() == 8) {
            System.out.println("Gerando chaves das Quartas de Finais!");
            List<Jogo> JogosQua1 = new ArrayList<Jogo>();
            JogosQua1.add(
                    new Jogo(1, "Mané Garrincha", "22/11/2022", "08:00", Quartas.get(0), Quartas.get(1), "a", 0, 0));
            List<Jogo> JogosQua2 = new ArrayList<Jogo>();
            JogosQua2.add(
                    new Jogo(2, "Mané Garrincha", "22/11/2022", "11:00", Quartas.get(2), Quartas.get(3), "a", 0, 0));
            List<Jogo> JogosQua3 = new ArrayList<Jogo>();
            JogosQua3.add(
                    new Jogo(3, "Mané Garrincha", "22/11/2022", "13:00", Quartas.get(4), Quartas.get(5), "a", 0, 0));
            List<Jogo> JogosQua4 = new ArrayList<Jogo>();
            JogosQua4.add(
                    new Jogo(4, "Mané Garrincha", "22/11/2022", "15:00", Quartas.get(6), Quartas.get(7), "a", 0, 0));
        }
        if (Quartas.size() == 0 && SemiFinal.size() > 0 && SemiFinal.size() == 4) {
            System.out.println("Gerando as chaves das Semi Finais!");
            List<Jogo> JogosSemi1 = new ArrayList<Jogo>();
            JogosSemi1.add(new Jogo(1, "Mané Garrincha", "23/11/2022", "08:00", SemiFinal.get(0), SemiFinal.get(1), "a",
                    0, 0));
            List<Jogo> JogosSemi2 = new ArrayList<Jogo>();
            JogosSemi2.add(new Jogo(2, "Mané Garrincha", "23/11/2022", "11:00", SemiFinal.get(2), SemiFinal.get(3), "a",
                    0, 0));
        }
        if (SemiFinal.size() == 0 && Final.size() > 0 && Final.size() == 2) {
            System.out.println("Gerando a chave da Final!");
            List<Jogo> JogosFinal1 = new ArrayList<Jogo>();
            JogosFinal1
                    .add(new Jogo(1, "Mané Garrincha", "25/11/2022", "14:00", Final.get(0), Final.get(1), "a", 0, 0));
        }
    }
}