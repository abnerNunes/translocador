public class Coordenador extends Professor{

    private Integer qtdHoras;
    private Double valorHora;

    public Coordenador(String nome, Integer qtdAula, Double valorAula, Integer qtdHoras, Double valorHora) {
        super(nome, qtdAula, valorAula);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public Double getBonusProf() {
        return super.getBonusProf();
    }

    public Double getBonusCoord(){
        Double bonusCoord = qtdHoras * valorHora * 0.2;
        return bonusCoord;
    }
}