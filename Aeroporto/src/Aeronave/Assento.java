package Aeronave;

public class Assento {
    private String Coordenada;
    private Boolean Ocupado;

    public Assento(String Coordenada, Boolean Ocupado){
        this.Coordenada = Coordenada;
        this.Ocupado = Ocupado;
    }

    public String getCoordenada() {
        return Coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.Coordenada = coordenada;
    }

    public Boolean getOcupado() {
        return Ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.Ocupado = ocupado;
    }
}
