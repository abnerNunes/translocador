import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Professor professor = new Professor("Roberta", 40, 100.0);
        Coordenador coordenador = new Coordenador("Abner", 40, 90.0, 40, 60.0);

        ControleBonus cont = new ControleBonus(new ArrayList<>());


        cont.adicionaFunc(professor);
        cont.adicionaFunc(coordenador);

        cont.exibeItensLista();

        System.out.println(cont.calculaTotalBonus());
    }
}
