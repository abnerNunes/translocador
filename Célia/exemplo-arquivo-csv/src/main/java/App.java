import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void gravaArquivoCsv(ListaObj<Cachorro> lista, String nomeArq) {
        FileWriter arq = null; // obejto que representa o arquivo que será usado
        Formatter saida = null; // objeto que será usado para escrever no arquivo
        boolean deuRuim = false;
        nomeArq += ".csv";

        //Bloco try-catch abrir o arquivo
        try {
            arq = new FileWriter(nomeArq, true);
            saida = new Formatter(arq);
        } catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo!");
            System.exit(1);
        }
        // Bloco try-catch para gravar no arquivo
        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
               Cachorro dog = lista.getElemento(i);
               saida.format("%d;%s;%s;%.2f\n", dog.getId(), dog.getNome(), dog.getPorte(), dog.getPeso());
            }
        } catch (FormatterClosedException erro){
            System.out.println("Erro");
            deuRuim=true;
        }finally{
            saida.close();

            try{
                arq.close();
            }catch(IOException erro){
                System.out.println("Erro2");
                deuRuim = true;
            }
            if (deuRuim){
                System.exit(1);
            }
        }
    }

    public static  void leArquivoCsv(String nomeArq){
        FileReader arq = null;
        Scanner entrada = null;
        boolean deuRuim = false;
        nomeArq += ".csv";

        try{
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch(FileNotFoundException erro){
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        try {
            System.out.printf("%4s %-15s %-9s %5s\n","ID", "NOME", "PORTE", "PESO");
            while (entrada.hasNext()){
                int id = entrada.nextInt();
                String nome = entrada.next();
                String porte = entrada.next();
                Double peso = entrada.nextDouble();
                System.out.printf("%4s %-15s %-9s %5s.2f\n", id, nome, porte, peso);
            }
        }
        catch(NoSuchElementException erro){
            System.out.println("Arquivo errado");
            deuRuim = true;
        }
        catch (IllegalStateException erro){
            System.out.println("Erro leitura");
            deuRuim = true;
        }
        finally{
            entrada.close();

            try{
                arq.close();
            }catch(IOException erro){
                System.out.println("Erro2");
                deuRuim = true;
            }
            if (deuRuim){
                System.exit(1);
            }
        }

    }

    public static void main(String[] args) {
        ListaObj<Cachorro> listaDog = new ListaObj<>(7);

        listaDog.adiciona(new Cachorro(1, "Pipo", "Medio", 10.0));
        listaDog.adiciona(new Cachorro(2, "Panela", "Pequeno", 5.0));
        listaDog.adiciona(new Cachorro(3, "Helicoptero", "Grande", 20.0));
        listaDog.adiciona(new Cachorro(4, "Pneu", "Medio", 8.0));
        listaDog.adiciona(new Cachorro(5, "Jacaré", "Grande", 18.0));

        listaDog.exibe();


        gravaArquivoCsv(listaDog, "dogs");

    }
}
