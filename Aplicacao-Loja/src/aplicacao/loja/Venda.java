package aplicacao.loja;

import java.util.ArrayList;
//Essa classe é a simulação de uma venda em no caixa - 1 cliente comprando
public class Venda {

    ArrayList<Produto> produtosVendas = new ArrayList<>();
    private String dataVenda;
    
    public double calculaTroco(double dinheiro){
        if(dinheiro - valorFinalVenda() <0){
        return -1;
        }
        return dinheiro - valorFinalVenda();
    }
    
    
    //Esse método adiciona um produto na venda
    public void adicionaProduto(Produto p) {
        System.out.println("Existe(m) "+Estoque.RETORNA_QTD_PRODUTO(p)+" "+p.getDescricao()+" no estoque");
        //Aqui a venda acontece
        if (Estoque.RETORNA_QTD_PRODUTO(p) > 0) {
            produtosVendas.add(p);
            //tira um produto do estoque
           int posicao = Estoque.PRODUTOS_ESTOQUE.indexOf(p);
           Estoque.PRODUTOS_ESTOQUE.get(posicao).baixaProduto();
        } 
        //aqui a venda não acontece
        else {
            System.out.println(p.getDescricao() + " em falta no estoque!");
        }
    }
    
    //Esse método mostra o valor final a ser pago pelo cliente
    public double valorFinalVenda() {
        double totalVenda = 0;
        //Iteração sobre toda a lista
        for (Produto produto : produtosVendas) {
            System.out.println("LOG SISTEMA----Produto:" + produto.getDescricao());
            totalVenda += produto.getValorFinal();
        }
        return totalVenda;
    }

}
