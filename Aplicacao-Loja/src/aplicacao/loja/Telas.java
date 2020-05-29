
package aplicacao.loja;

import javax.swing.JOptionPane;

public class Telas {
    
    public void telaPrincipal(){
       String opcaoes []= {"Cadastro","Venda","Consulta Estoque"};
       int escolha = JOptionPane.showOptionDialog(null, "Escolha a operação", "SISTEMA SUPERMECADO", 
               0,JOptionPane.QUESTION_MESSAGE, null, opcaoes, null);
       
       switch(escolha){
       case 0:
           cadastroProdutos();
           telaPrincipal();
           break;
       case 2:
           consultaEstoque();
           telaPrincipal();
           break;
           
       default:
           JOptionPane.showMessageDialog(null, "Opção inválida");
       }
    }
    
    public void cadastroProdutos(){
        Produto novoProduto = new Produto();
        String descricao = JOptionPane.showInputDialog(null, "Entre com a descrição do produto",
            "Cadastro produto", JOptionPane.QUESTION_MESSAGE);
        String valorCompra = JOptionPane.showInputDialog(null, "Entre com o valor de compra do produto",
            "Cadastro produto", JOptionPane.QUESTION_MESSAGE);
        String valorVenda  = JOptionPane.showInputDialog(null, "Entre com o valor de venda produto",
            "Cadastro produto", JOptionPane.QUESTION_MESSAGE);
        String quantidade = JOptionPane.showInputDialog(null, "Entre com a quantidade de estoque do produto",
            "Cadastro produto", JOptionPane.QUESTION_MESSAGE);
    
        novoProduto.setDescricao(descricao);
        novoProduto.setValorCompra(Double.parseDouble(valorCompra));
        novoProduto.setValorFinal(Double.parseDouble(valorVenda));
        novoProduto.setQuantidadeProdutos(Integer.parseInt(quantidade));
        
        Estoque.ADICIONA_PRODUTO(novoProduto);
    }
    
    public void consultaEstoque(){
        //isEmpty - é vazio
        if(Estoque.PRODUTOS_ESTOQUE.isEmpty()){
        JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado");
        }else{
            String texto = "";
            
            //Percorrendo a lista de produtos e pegando 1 produto por vez            
            for(Produto p:Estoque.PRODUTOS_ESTOQUE){
                texto += p.getCodigo()+" - ";
                texto += p.getDescricao()+" - ";
                texto += p.getValorFinal()+" - ";
                texto += p.getQuantidadeProdutos()+" no estoque\n";
            }
            JOptionPane.showMessageDialog(null, texto);
        }
        
    }
    
}
