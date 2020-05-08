
package aula.arraylist;

import java.util.ArrayList;

public class AulaArrayList {

    public static void main(String[] args) {
        //Instância o ArrayLista
        //Obs Listas aceitam elementos repetidos
        ArrayList<String> itensChurrasco = new ArrayList<>();
        
        //Adiciona item na lista
        itensChurrasco.add("Costela mindinha");
        itensChurrasco.add("Cerveja");
        itensChurrasco.add("Carvão");
        itensChurrasco.add("picanha");
        itensChurrasco.add("Caipirinha");
        itensChurrasco.add("Arroz");
        itensChurrasco.add("Coca");
        itensChurrasco.add("Suco de laranja");
        
        //remover 1 item da lista
        itensChurrasco.remove("Carvão");
        itensChurrasco.remove("Arroz");
        
        ArrayList<String> itensPatrocinio = new ArrayList<>();
        itensPatrocinio.add("Coca");
        itensPatrocinio.add("Cerveja");
        itensPatrocinio.add("picanha");
        itensPatrocinio.add("Churrasqueira");
        
        //remover todos os itens existentes em uma lista de entrada
        itensChurrasco.removeAll(itensPatrocinio);
        
        
        //LIMPA a lista, deixa vazia.
//        itensChurrasco.clear();
        
        
        //isEmpty - é vazio  - retorna verdadeiro se a lista for vazia
//        System.out.println(itensChurrasco.isEmpty());
        
        //contains - retorna verdadeira se o elemente existe na lista
        System.out.println(itensChurrasco.contains("Caipirinha"));
        
        itensChurrasco.add("Coca");
        itensChurrasco.add("Coca");
        itensChurrasco.add("Coca");
        itensChurrasco.add("Coca");
        itensChurrasco.add("coca");
        //retorna o indice do elemente se ele estiver na lista, caso contrario, retorna -1.
        System.out.println(itensChurrasco.indexOf("Coca"));
        System.out.println(itensChurrasco.lastIndexOf("Caipirinha"));
        
        
        //mostrando toda lista
        for(int i = 0; i < itensChurrasco.size();i++){
            System.out.println("Itens do churrasco -- "+ itensChurrasco.get(i));
        }     
        
        
        System.out.println("Quantidade de itens:"+itensChurrasco.size());
    }
    
}
