package Pessoas;

public class Bagagem {
    private int id;
    private double peso;

    public Bagagem(int id, double peso){
        this.id = id;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
