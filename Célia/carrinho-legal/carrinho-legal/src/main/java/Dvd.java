public class Dvd extends Produto{
    private String gravadora;

    public Dvd(int codigo, String nome, Double precoCusto, String gravadora) {
        super(codigo, nome, precoCusto);
        this.gravadora = gravadora;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public void setCodigo(int codigo) {
        super.setCodigo(codigo);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public Double getPrecoCusto() {
        return super.getPrecoCusto();
    }

    @Override
    public void setPrecoCusto(Double precoCusto) {
        super.setPrecoCusto(precoCusto);
    }

    @Override
    public Double getValorVenda() {
        Double valorVenda = getPrecoCusto()*1.2;
        return valorVenda;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "codigo='" + getCodigo() + '\'' +
                "nome='" + getNome() + '\'' +
                "preço='" + getNome() + '\'' +
                "gravadora='" + getGravadora() + '\'' +
                '}';
    }
}
