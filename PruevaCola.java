package colapardatosgenerico;

import java.util.Random;
/**
 *
 * @author acer
 */
public class PruevaCola {
    public static void main(String args []){
       Random gen = new Random();
        Cola <Double> cd= new <Double> Cola(3);
         Cola <String > cs= new <String> Cola(3);
       ////Pila Objetos
        Cola<Estudiante>PE=new<Estudiante>Cola(10);
       try{
           cd.encolar(10.0);
            cd.encolar(12.51);
            double c=cd.sacar();
            System.out.println(c);
            c=cd.sacar();
            System.out.println(c);
       }catch(ExcepcionColaLLena err){
           System.out.println(err.getMessage());
       }catch(ExcepcionColaVacia err){
           System.out.println(err.getMessage());
       }
        System.out.println("Cola de cadenas");
        try{
           cs.encolar("e");
            cs.encolar("d");
            String c=cs.sacar();
            System.out.println(c);
            c=cs.sacar();
            System.out.println(c);
       }catch(ExcepcionColaLLena err){
           System.out.println(err.getMessage());
       }catch(ExcepcionColaVacia err){
           System.out.println(err.getMessage());
       }
         try{
            Estudiante e1,e2;
            e1=new Estudiante("Pablo","18590602");
            e2=new Estudiante("Sybelle","185901590");
        PE.encolar(e1);
        PE.encolar(e2);
        Estudiante Ref=PE.sacar();
        Ref=PE.sacar();
         System.out.println(Ref);
          System.out.println(Ref);
       }catch(ExcepcionColaLLena err){
           System.out.println(err.getMessage());
       }catch(ExcepcionColaVacia err){
           System.out.println(err.getMessage());
       }
    }
}
