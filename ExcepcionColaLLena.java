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
public class ExcepcionColaLLena extends Exception{

    public ExcepcionColaLLena() {
        super("La cola esta llena");
    }
    
}
