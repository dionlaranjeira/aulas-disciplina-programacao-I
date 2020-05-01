
package aula.interfaces;


//extends - herdar - classes
//implements - implementar - interfaces
// java não existe herança múltipla - só posso ter um extends
public class Ferrari extends Carro implements Automovel,ItemCaro{

    @Override
    public void acelerar() {
        System.out.println("Ferrari acelerou!");
    }

    @Override
    public void freiar() {
       System.out.println("Ferrari freiou!"); 
    }

    @Override
    public void virarDireita() {
        System.out.println("Ferrari virou a direita");
    }

    @Override
    public void virarEsquerda() {
        System.out.println("Ferrari virou a esquerda");  
    }

    @Override
    void abrirPorta() {
        System.out.println("Ferrari abriu a porta");
    }

    @Override
    public double getValor() {
        return 5000000.00;
    }
    
}
