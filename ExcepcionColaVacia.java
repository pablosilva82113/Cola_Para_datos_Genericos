/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colapardatosgenerico;

/**
 *
 * @author acer
 */
public class ExcepcionColaVacia extends Exception{

    public ExcepcionColaVacia() {
        super("La cola ya esta vacia");
    }
    
}
