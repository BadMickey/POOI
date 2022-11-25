package Pessoas;

import java.util.ArrayList;

public class Passageiro extends Pessoa{
    private String Passaporte;
    private ArrayList<Bagagem> Bagagens;

    public Passageiro(String CPF, String nome, String email, String telefone, String DataNasc, String Passaporte, ArrayList Bagagens) {
        super(CPF, nome, email, telefone, DataNasc);
        this.Passaporte = Passaporte;
        this.Bagagens = Bagagens;
    }

    public String getPassaporte() {
        return Passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.Passaporte = passaporte;
    }

    public ArrayList<Bagagem> getBagagens() {
        return Bagagens;
    }

    public void setBagagens(ArrayList<Bagagem> bagagens) {
        this.Bagagens = bagagens;
    }

}
