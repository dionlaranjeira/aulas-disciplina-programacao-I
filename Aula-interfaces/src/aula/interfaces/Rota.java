
package aula.interfaces;

public class Rota {
    
    public void irCentro(Automovel a){
        a.acelerar();
        a.virarDireita();
        a.acelerar();
        a.freiar();
        a.acelerar();
        a.virarEsquerda();
    }
    
}
