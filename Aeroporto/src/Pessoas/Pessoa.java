package Pessoas;

public class Pessoa {
    protected String CPF;
    protected String nome;
    protected String email;
    protected String telefone;
    protected String DataNasc;

    public Pessoa(String CPF, String nome, String email, String telefone, String DataNasc){
        this.CPF = CPF;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.DataNasc = DataNasc;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        this.CPF = cPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.DataNasc = dataNasc;
    }
}
