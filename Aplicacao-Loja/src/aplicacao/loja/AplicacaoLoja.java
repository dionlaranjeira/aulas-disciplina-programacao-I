package aplicacao.loja;

import java.util.Scanner;

public class AplicacaoLoja {

    public static void main(String[] args) {
        //Leito de teclado
        Scanner input = new Scanner(System.in);
        
        //Cadastro de produto
        Produto skol = new Produto();
        skol.setCodigo("001");
        skol.setDescricao("Skol latinha");
        skol.setValorCompra(1.00);
        skol.setValorFinal(2.50);
        skol.setQuantidadeProdutos(2);
        
        //Adicionando produtos no estoque
        Estoque.ADICIONA_PRODUTO(skol);
        
        //Efetuando vendas
        Venda venda1 = new Venda();
        venda1.adicionaProduto(skol);
        venda1.adicionaProduto(skol);
        venda1.adicionaProduto(skol);
        double preco = venda1.valorFinalVenda();
        
        System.out.println("Valor a ser pago: "+ preco);
        
        System.out.println("Entre com o valor pago: ");
        double dinheiroPago = input.nextDouble();
        
        double troco = venda1.calculaTroco(dinheiroPago);
        System.out.println("Valor do troco: "+ troco);
    }
    
}
