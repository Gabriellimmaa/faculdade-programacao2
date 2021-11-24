public class ProdutoUnitario extends Produto implements IProduto {
    private int quantidadeEstoque = 0;

    public ProdutoUnitario(int codigo, String nome, double preco) {
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
