package aplicacao.loja;

import java.util.ArrayList;

public class Estoque {

    static ArrayList<Produto> PRODUTOS_ESTOQUE = new ArrayList<>();

    public void adicionaProdutoEstoque(Produto p) {
        PRODUTOS_ESTOQUE.add(p);
    }
    
    public int retornaQTDproduto(Produto p){
        int posicao = PRODUTOS_ESTOQUE.indexOf(p);
        return PRODUTOS_ESTOQUE.get(posicao).getQuantidadeProdutos();
    }
    
}
