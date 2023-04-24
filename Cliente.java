import javax.print.attribute.standard.RequestingUserName;

public class Cliente {
    private String nome;
    private Venda venda;

    public Cliente(String nome, Venda venda){
        this.nome = nome;
        this.venda = venda;

    }

    public String getNome() {
        return nome;
    }
    public Venda getVenda(){
        return venda;

    }
        

}
