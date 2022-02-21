public class Livro extends Produto{

    private String autor;
    private String isbn;

    public Livro(int codigo, String nome, Double precoCusto, String autor, String isbn) {
        super(codigo, nome, precoCusto);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
    public String toString() {
        return "Livro{" +
                "codigo='" + getCodigo() + '\'' +
                "nome='" + getNome() + '\'' +
                "preço='" + getPrecoCusto() + '\'' +
                "autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public Double getValorVenda() {
        Double valorVenda = getPrecoCusto()*1.1;
        return valorVenda;
    }
}
