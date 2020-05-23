package aplicacao.loja;

import java.util.ArrayList;

public class Venda {

    ArrayList<Produto> produtosVendas = new ArrayList<>();
    private String dataVenda;

    public void adicionaProduto(Produto p) {
        produtosVendas.add(p);
    }

    public double valorFinalVenda() {
        double totalVenda = 0;
        //Iteração sobre toda a lista
        for (Produto produto : produtosVendas) {
            System.out.println("Produto:" + produto.getDescricao());
            totalVenda += produto.getValorFinal();
        }
        return totalVenda;
    }

}
