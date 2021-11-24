import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;

public class Main {
    public static void main (String[] args) {
        ArrayList<Produto> lista = new ArrayList<Produto>();

        ProdutoUnitario pu1 = new ProdutoUnitario(20, "Leite longa vida 1 litro", 5.20);
        pu1.adicionarEstoque(10);
        pu1.vender(2);
        System.out.println("Código: " + pu1.getCodigo() + " | Nome: " + pu1.getNome() + " | Preco: " + pu1.getPreco() + " | Valor em estoque: " + pu1.calcularValorEmEstoque());
        lista.add(pu1);

        ProdutoFracionado pf2 = new ProdutoFracionado(10, "Tomate", 1.2);
        pf2.adicionarEstoque(50);
        pf2.vender(1);
        System.out.println("Código: " + pf2.getCodigo() + " | Nome: " + pf2.getNome() + " | Preco: " + pf2.getPreco() + " | Valor em estoque: " + pf2.calcularValorEmEstoque());
        lista.add(pf2);

        ProdutoUnitario pu3 = new ProdutoUnitario(9, "Miojo", 7.0);
        pu3.adicionarEstoque(25);
        pu3.vender(1);
        System.out.println("Código: " + pu3.getCodigo() + " | Nome: " + pu3.getNome() + " | Preco: " + pu3.getPreco() + " | Valor em estoque: " + pu3.calcularValorEmEstoque());
        lista.add(pu3);

        ProdutoFracionado pf4 = new ProdutoFracionado(37, "Cebola", 0.60);
        pf4.adicionarEstoque(50);
        pf4.vender(1);
        System.out.println("Código: " + pf4.getCodigo() + " | Nome: " + pf4.getNome() + " | Preco: " + pf4.getPreco() + " | Valor em estoque: " + pf4.calcularValorEmEstoque());
        lista.add(pf4);

        Collections.sort(lista, new Comparator<Produto>() {
            @Override
            public int compare(Produto o1, Produto o2) {
                return o1.getCodigo() - o2.getCodigo();
            }
        });
        System.out.println("-------------------------------- LISTA ORDEM POR CÓDIGOS --------------------------------------");
        for (Object produto : lista) {
            System.out.println(produto);
        }
    }
}
