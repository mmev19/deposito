/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

import entidadFinanciera.CCuenta;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    
    }
    
    public static void probarIngresar(CCuenta objetoCuenta, float cantidadEsperada) {
        try {
            objetoCuenta.ingresar(500);
            System.out.println("Ingreso exitoso: "+objetoCuenta.estado());
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public static void probarRetirar(CCuenta objetoCuenta, float cantidadEsperada) {
        try {
            objetoCuenta.retirar(300);
            System.out.println("Retirada exitosa: "+objetoCuenta.estado());
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
