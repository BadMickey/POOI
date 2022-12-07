package Leitores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Leitor extends JFrame{

    public String Contents[];
    private int A = 0;
    private int O = 0;
    private int Os = 0;
    private int Daquele = 0;
    private int Ele = 0;
    private int Ela = 0;
    private int Que = 0;
    private int Esta = 0;
    private int Essa = 0;
    private int Eu = 0;
    private int Um = 0;
    private int Umas = 0;
    private int Uns = 0;
    private int Tu = 0;
    private int Qual = 0;

    public void Read(String dir) throws IOException{//Lê o arquivo e separa todas as palavras em um array de strings
        String Content = "";
        try {
            FileReader file = new FileReader(dir);
            BufferedReader readfile = new BufferedReader(file);
            String line = "";
            try {
                line = readfile.readLine();
                while(line!=null){
                    Content += line+"\n"; //Soma tudo em uma string para ser separada depois no array de string
                    line = readfile.readLine();
                }
                Content = Content.replaceAll("\\.", "");//Remove caracteres especificos da String antes de se separar para o array
                Content = Content.replaceAll("\\,", "");
                Content = Content.replaceAll("\\;", "");
                Content = Content.replaceAll("\\!", "");
                Content = Content.replaceAll("\\—", "");
                Contents = Content.split("\\s");//Separa a string em um Array
                file.close();
            }catch (IOException ex){
                System.out.println("O arquivo não conseguiu ser aberto!");
            }
        } catch(FileNotFoundException ex){
            System.out.println("Arquivo não existente!");
        }
    }

    public void Counter (){//Conta quantas vezes os artigos e pronomes aparecem no texto
        for(int i = 0; i < Contents.length; i++){
            String Compare = Contents[i];
            if(Compare.compareToIgnoreCase("a")==0){
                A+=1;
            }
            else if(Compare.compareToIgnoreCase("o")==0){
                O+=1;
            }
            else if(Compare.compareToIgnoreCase("os")==0){
                Os+=1;
            }
            else if(Compare.compareToIgnoreCase("daquele")==0){
                Daquele+=1;
            }
            else if(Compare.compareToIgnoreCase("ele")==0){
                Ele+=1;
            }
            else if(Compare.compareToIgnoreCase("ela")==0){
                Ela+=1;
            }
            else if(Compare.compareToIgnoreCase("que")==0){
                Que+=1;
            }
            else if(Compare.compareToIgnoreCase("esta")==0){
                Esta+=1;
            }
            else if(Compare.compareToIgnoreCase("essa")==0){
                Essa+=1;
            }
            else if(Compare.compareToIgnoreCase("eu")==0){
                Eu+=1;
            }
            else if(Compare.compareToIgnoreCase("um")==0){
                Um+=1;
            }
            else if(Compare.compareToIgnoreCase("umas")==0){
                Umas+=1;
            }
            else if(Compare.compareToIgnoreCase("uns")==0){
                Uns+=1;
            }
            else if(Compare.compareToIgnoreCase("tu")==0){
                Tu+=1;
            }
            else if(Compare.compareToIgnoreCase("qual")==0){
                Qual+=1;
            }
        }
    }
    public void MakePizza(){//Função que irá criar o gráfico
        DefaultPieDataset pieDataset = new DefaultPieDataset();
            pieDataset.setValue(" A ", A);//Adiciona os valores que irão ser mostrados
            pieDataset.setValue(" O ", O);
            pieDataset.setValue(" Os ", Os);
            pieDataset.setValue(" Daquele ", Daquele);
            pieDataset.setValue(" Ele ", Ele);
            pieDataset.setValue(" Ela ", Ela);
            pieDataset.setValue(" Que ", Que);
            pieDataset.setValue(" Esta ", Esta);
            pieDataset.setValue(" Essa ", Essa);
            pieDataset.setValue(" Eu ", Eu);
            pieDataset.setValue(" Um ", Um);
            pieDataset.setValue(" Umas ", Umas);
            pieDataset.setValue(" Uns ", Uns);
            pieDataset.setValue(" Tu ", Tu);
            pieDataset.setValue(" Qual ", Qual);

            JFreeChart grafic = ChartFactory.createPieChart3D("Artigos e Pronomes", pieDataset, true, true, true); //Cria o gráfico

            this.add(new ChartPanel(grafic));

            this.pack();
            this.setVisible(true);//Deixa vísivel
    }

    public void CounterString(String word){//Função que percorre o array de string e imprime quantas vezes a palavra é encontrada
        int vezes = 0;
        for(int i = 0; i < Contents.length; i++){
            if(Contents[i].compareToIgnoreCase(word)==0){
                vezes+=1;
            }
        }
        System.out.println(vezes);
    }
}
