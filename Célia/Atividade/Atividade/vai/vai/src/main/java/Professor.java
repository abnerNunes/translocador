public class Professor{

    private String nome;
    private Integer qtdAula;
    private Double valorAula;

    public Professor(String nome, Integer qtdAula, Double valorAula) {
        this.nome = nome;
        this.qtdAula = qtdAula;
        this.valorAula = valorAula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdAula() {
        return qtdAula;
    }

    public void setQtdAula(Integer qtdAula) {
        this.qtdAula = qtdAula;
    }

    public Double getValorAula() {
        return valorAula;
    }

    public void setValorAula(Double valorAula) {
        this.valorAula = valorAula;
    }

    public Double getBonusProf(){
        Double bonusProf = valorAula * qtdAula * 0.15;
        return bonusProf;
    }


}
