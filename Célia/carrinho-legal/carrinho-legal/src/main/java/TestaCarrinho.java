import java.util.ArrayList;
import java.util.Scanner;

public class TestaCarrinho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Carrinho carrinho = new Carrinho(new ArrayList<>());
        Boolean controler = true;


        while (controler) {
            System.out.println("1.Adicionar Livro \n 2.Adicionar Dvd \n 3.Adicionar Serviço \n 4.Exibir Itens \n 5.Exibir total \n 6.Sair");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Insira as informações do Livro");

                    System.out.println("Insira o código do livro:");
                    int codLivro = scan.nextInt();

                    System.out.println("Insira o nome do livro:");
                    String nomeLivro = scan2.nextLine();

                    System.out.println("Insira o preço do livro:");
                    Double precoLivro = scan3.nextDouble();

                    System.out.println("Insira o autor do livro:");
                    String nomeAutor = scan2.nextLine();

                    System.out.println("Insira o isbn:");
                    String codIsbn = scan2.nextLine();

                    Livro livro = new Livro(codLivro, nomeLivro, precoLivro, nomeAutor, codIsbn);
                    carrinho.adicionaVendavel(livro);


                    break;

                case 2:
                    System.out.println("Insira as informações do DVD");

                    System.out.println("Insira o código do DVD:");
                    int codDvd = scan.nextInt();

                    System.out.println("Insira o nome do DVD:");
                    String nomeDvd = scan2.nextLine();

                    System.out.println("Insira o preço do DVD:");
                    Double precoDvd = scan3.nextDouble();

                    System.out.println("Insira a gravadora do DVD:");
                    String nomeGravadora = scan2.nextLine();


                    Dvd dvd = new Dvd(codDvd, nomeDvd, precoDvd, nomeGravadora);
                    carrinho.adicionaVendavel(dvd);


                    break;

                case 3:
                    System.out.println("Insira as informações do serviço");

                    System.out.println("Insira o descrição do serviço:");
                    String descServ = scan2.nextLine();

                    System.out.println("Insira o codigo do servço:");
                    int codServ = scan.nextInt();

                    System.out.println("Insira o a quantidade de horas:");
                    int qtdHoras = scan.nextInt();

                    System.out.println("Insira o valor da hora1:");
                    Double valorHora = scan3.nextDouble();


                    Servico serv = new Servico(descServ, codServ, qtdHoras, valorHora);
                    carrinho.adicionaVendavel(serv);


                    break;

                case 4:
                    carrinho.exibeItensCarrinho();
                    break;

                case 5:
                    Double totalVenda = carrinho.calculaTotalVenda();
                    System.out.println(totalVenda);
                    break;

                case 6:
                    controler = false;
                    break;

            }
        }

    }
}
