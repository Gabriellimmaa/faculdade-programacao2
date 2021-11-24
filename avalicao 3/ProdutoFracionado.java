public class ProdutoFracionado extends Produto implements IProduto {
    private double quantidadeEstoque = 0;

    public ProdutoFracionado(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    public void adicionarEstoque(int qtd){
        quantidadeEstoque += qtd;
    }

    public void vender(int qtd){
        quantidadeEstoque -= qtd;
    }

    @Override
    public double calcularValorEmEstoque() {
        double total;
        total = quantidadeEstoque*getPreco();
        return total;
    }

}