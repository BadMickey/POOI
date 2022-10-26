package Pessoa;

public class Tecnico extends Pessoa{

    private int Jogos;
    private int CodTecnico;
    public Equipe equipe;


    public Tecnico(String Nome, int CPF, String Telefone, String Funcao, String Email) {
        super(Nome, CPF, Telefone, Funcao, Email);
        this.Nome = Nome;
        
    }
    
}
