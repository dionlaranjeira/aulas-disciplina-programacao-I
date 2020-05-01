/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.interfaces;

/**
 *
 * @author dion_
 */
public class AulaInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ferrari f1 = new Ferrari();
        Rota rota1 = new Rota();
        
        rota1.irCentro(f1);
    }
    
}
