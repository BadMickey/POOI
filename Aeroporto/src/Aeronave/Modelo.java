package Aeronave;

public enum Modelo {

    BOEING_727("boeing 727"), BOEING_767("boeing 767");

    private String Tipo;

    Modelo(String Tipo){
        this.Tipo = Tipo;
    }

    public String getModelos() {
        return Tipo;
    }

    public void setModelos(String tipo) {
        this.Tipo = tipo;
    }
    
}
