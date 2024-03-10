/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 * Clase que representa una cuenta bancaria.
 * @author Marta Escudero
 */

public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    /**
     * Número de la cuenta banaria
     */
    private String cuenta;
    /**
     * Saldo actual de la cuenta
     */
    private double saldo;
    /**
     * Tipo de interés anual aplicado a la cuenta
     */
    private double tipoInterés;

    /**
     * Constructor por defecto
     */
    public CCuenta(){
    }
    /**
     * Constructor con parámetros
     * 
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de la cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés anual
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Obtiene el nombre del titular de la cuenta
     * 
     * @return Nombre del titular
     */
    public String getNombre() {
        return nombre;
    }
    /**
    * Establece el nombre del titular de la cuenta
    * @param nombre Nombre del titular
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el número de la cuenta
     * @return Número de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Establece el número de la cuenta 
     * @param cuenta Número de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Obtiene el saldo actual de la cuenta
     * @return Saldo actual
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Establece el saldo actual de la cuenta
     * @param saldo Nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Obtiene el tipo de interés aplicado a la cuenta
     * @return Tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * Establece el tipo de interés aplicado a la cuenta
     * @param tipoInterés Tipo de interés anual
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Obtiene el estado actual de la cuenta
     * @return Saldo actual.
     */
    public double estado(){
        return this.saldo;
    }
    /**
    * Ingresa una cantidad de dinero en la cuenta
    * @param cantidad Cantidad a ingresar
    * @throws Exception Si la cantidad es negativa
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        saldo = saldo + cantidad;
    }
    
    /**
     * Constante que representa el mensaje de error para una cantidad negativa
     */
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    /**
    * Retira una cantidad de dinero de la cuenta.
    * @param cantidad Cantidad a retirar
    * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}


    
   