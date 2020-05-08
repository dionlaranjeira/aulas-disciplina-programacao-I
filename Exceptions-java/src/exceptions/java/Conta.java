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
public class Conta {

    private double saldo;

    public void deposito(double valor) throws Exception {
        if (valor > 0) {
            saldo += valor;
        }else{
          throw new Exception("Erro ao depositar, valor inválido!");
        }
        
    }

    public void sacar(double valor)throws Exception{
        if(valor<=0){
        throw new Exception("Erro ao sacar, valor inválido!");
        }else if(valor > saldo){
        throw new Exception("Erro ao sacar, saldo insuficiente!");
        }else{
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

}
