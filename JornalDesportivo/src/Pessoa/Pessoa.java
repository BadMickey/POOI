package Pessoa;

public class Pessoa {
    private String Nome;
    private int CPF;
    private String Telefone;
    private String Funcao;
    private String Email;

    public Pessoa(String Nome, int CPF, String Telefone, String Funcao, String Email){
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.Funcao = Funcao;
        this.Email = Email;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getCPF() {
        return CPF;
    }
    public void setCPF(int cPF) {
        CPF = cPF;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
    public String getFuncao() {
        return Funcao;
    }
    public void setFuncao(String funcao) {
        Funcao = funcao;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

}
