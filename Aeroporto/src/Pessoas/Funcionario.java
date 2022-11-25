package Pessoas;

public class Funcionario extends Pessoa{
    private int id;
    private String funcao;
    private Boolean CoPiloto;
    private Boolean Piloto;
    private Boolean Aeromoca;

    public Funcionario(String CPF, String nome, String email, String telefone, String DataNasc, int id, String funcao, Boolean CoPiloto, Boolean Piloto, Boolean Aeromoca) {
        super(CPF, nome, email, telefone, DataNasc);
        this.id = id;
        this.CoPiloto = CoPiloto;
        this.Piloto = Piloto;
        this.Aeromoca = Aeromoca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getCoPiloto() {
        return CoPiloto;
    }

    public void setCoPiloto(Boolean coPiloto) {
        this.CoPiloto = coPiloto;
    }

    public Boolean getPiloto() {
        return Piloto;
    }

    public void setPiloto(Boolean piloto) {
        this.Piloto = piloto;
    }

    public Boolean getAeromoca() {
        return Aeromoca;
    }

    public void setAeromoca(Boolean aeromoca) {
        this.Aeromoca = aeromoca;
    }
    
}
