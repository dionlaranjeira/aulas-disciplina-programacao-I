package aplicacao.loja;

public class Produto {
    private static int codigos = 0;
    
    private int quantidadeProdutos;
    private String codigo;
    private String descricao;
    private double valorCompra;
    private double valorFinal;
    
    //Construtor
    public Produto() {
        codigos++;
        codigo = String.valueOf(codigos);
    }
    
    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }
    
    
    //Esse método tira um produto da quantidade de produtos
    public void baixaProduto(){
    quantidadeProdutos--;
    }
    
    public void setQuantidadeProdutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    

}
