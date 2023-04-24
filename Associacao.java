
public class Associacao {
    public static void main(String[] args) {
        
        Produto laranja = new Produto("Laranja");
        Venda vendeLaranja = new Venda(5, laranja);
        Cliente joao = new Cliente("João", vendeLaranja);

        joao.getVenda().venderProduto();

    
    }
}
