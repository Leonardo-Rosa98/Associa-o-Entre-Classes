public class Venda {
    private int venda;
    private Produto produto;

    public Venda(int venda, Produto produto) {
        this.venda = venda;
        this.produto = produto;
    }

    public Produto geProduto(){
        return produto;
    }

    public void venderProduto() {
        System.out.println("Você vendeu " + venda + " " + produto.getNome() + "(s)");
    }

}
