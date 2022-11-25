package Pessoas;

public class Aeromoca extends Pessoa{
    private int Id;
    private String escalas;
    private String funcao;

    public Aeromoca(String CPF, String nome, String email, String telefone, String DataNasc, int Id, String escalas, String funcao) {
        super(CPF, nome, email, telefone, DataNasc);
        this.Id = Id;
        this.escalas = escalas;
        this.funcao = funcao;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getEscalas() {
        return escalas;
    }

    public void setEscalas(String escalas) {
        this.escalas = escalas;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
