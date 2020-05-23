
package aplicacao.loja;

public class AplicacaoLoja {

    public static void main(String[] args) {
        Produto coca = new Produto();
        coca.setDescricao("Coca 2l");
        coca.setValorFinal(8.00);
        
        Produto skol = new Produto();
        skol.setDescricao("Skol latinha");
        skol.setValorFinal(2.50);
        
        Venda venda1 = new Venda();
        venda1.adicionaProduto(skol);
        venda1.adicionaProduto(skol);
        venda1.adicionaProduto(skol);
        
        double preco = venda1.valorFinalVenda();
        System.out.println(preco);
        
        
    }
    
}
