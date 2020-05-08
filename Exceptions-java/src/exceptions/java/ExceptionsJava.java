/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions.java;

/**
 *
 * @author dion_
 */
public class ExceptionsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        
        try {
            conta1.deposito(1000);
            System.out.println("Deposito realizado com sucesso!");
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
                
        try {
          conta1.sacar(500);
            System.out.println("Saque realizado com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
        System.out.println("Saldo da conta: "+conta1.getSaldo());
    }
    
}
