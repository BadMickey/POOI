import java.util.Scanner;

import Leitores.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Leitor leitor = new Leitor();

        leitor.Read("C:/Users/Joãovirone/Documents/Projetos/Tarefas de Programação Orientada a Objetos I - Engenharia de Software/POOI/Prova/src/Visio.txt");//Chama a função que lê o arquivo e separa as strings
        leitor.Counter();//Chama a função que conta quantas vezes os artigos e pronomes ocorrem
        leitor.MakePizza();//Chama a função que faz o gráfico

        System.out.println("Digite a palavra a ser pesquisada");
        String word;
        word = ler.nextLine();
        leitor.CounterString(word);//Chama a função que verifica quantas vezes a palavra ocorre no texto todo.
    }
}
