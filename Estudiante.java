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
public class Estudiante {
    private String Nombre;
    private String NoControl;

    public Estudiante(String Nombre, String NoControl) {
        this.Nombre = Nombre;
        this.NoControl = NoControl;
    }

    @Override
    public String toString() {
        return Nombre+"\n"+NoControl;
    }
    
}
