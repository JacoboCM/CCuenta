package ccuenta;
/**
 * 
 * @author  Jacobo
 * @version 1.0
 * @since   20/05/22
 * Prueba para github
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta(){
    }
    /**
     * 
     * @param nom guarda un valor para nombre
     * @param cue guarda un valor para cuenta
     * @param sal guarda la cuantía que posee la cuenta
     * @param tipo guarda un valor para operar con él
     */
    public CCuenta(String nom, String cue, double sal, double tipo){
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * 
     * @return devuelve la cuantía que posee la cuenta
     */
    public double estado(){
        return saldo;
    }
    /**
     * 
     * @param cantidad guarda un valor para operar con saldo
     * @throws Exception indica que cantidad no puede ser menor que 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * 
     * @param cantidad guarda un valor para operar con saldo
     * @throws Exception indica que cantidad no puede ser menor que 0 y
     * no puede ser mayor que el valor que devuelve estado().
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
