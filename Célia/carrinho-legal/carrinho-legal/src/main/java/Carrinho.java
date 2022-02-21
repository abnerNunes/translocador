import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Vendavel>cart;

    public Carrinho(List<Vendavel> cart) {
        this.cart = new ArrayList<>();
    }

    public void adicionaVendavel(Vendavel v){
    cart.add(v);
    }

    public double calculaTotalVenda(){
       Double soma = 0.0;
    for(Vendavel v : cart){
        soma+= v.getValorVenda();
    }

    return soma;
    }

    public void exibeItensCarrinho(){

            for(Vendavel v : cart){
                System.out.println(v);
            }
    }
}
