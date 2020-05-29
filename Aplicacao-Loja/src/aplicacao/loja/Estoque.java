package aplicacao.loja;

import java.util.ArrayList;

public class Estoque {

    static ArrayList<Produto> PRODUTOS_ESTOQUE = new ArrayList<>();
    
    //Esse método adiciona um produto no estoque geral
    public static void ADICIONA_PRODUTO(Produto p) {
        PRODUTOS_ESTOQUE.add(p);
    }
    
    //Esse método retorna a quantidade de um determinado produto no estoque
    public static int RETORNA_QTD_PRODUTO(Produto p){
        int posicao = PRODUTOS_ESTOQUE.indexOf(p);
        return PRODUTOS_ESTOQUE.get(posicao).getQuantidadeProdutos();
    }
    
}
