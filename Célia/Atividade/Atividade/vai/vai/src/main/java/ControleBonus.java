import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Professor> prof;

    public ControleBonus(List<Professor> prof) {
        this.prof = new ArrayList<>();
    }

    public void adicionaFunc(Professor p){
        prof.add(p);
    }

    public void exibeItensLista(){
        for (Professor p : prof){
            System.out.println(p);
        }
    }

    public double calculaTotalBonus(){
        Double soma = 0.0;

        for (Professor p : prof){
            if(p instanceof Coordenador){
                soma += ((Coordenador) p).getBonusCoord();
            }
            soma += p.getBonusProf();
        }
        return soma;
    }
}