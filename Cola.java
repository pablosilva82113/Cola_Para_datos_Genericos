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
public class Cola<T> {

private T Esquina [];
private int Frente; 
private int Siguiente; 

    public Cola(int N){
        Esquina = (T[]) new Object [N];
        //Pocicion inicial de el siguiente
        Siguiente=0;
        //Pocicion inicial  de frente
        Frente=-1;
    }
    public boolean colaLLena(){
        if(Siguiente==Esquina.length){
            return true;
        }else{
            return false;
        }
    }
    public void encolar(T Num)throws ExcepcionColaLLena {
        if(colaVacia()){
             Frente=-1;
            Siguiente=0;
        }
        if(colaLLena()){
            throw new ExcepcionColaLLena();
        }
      Esquina [Siguiente] = Num; 
      Siguiente++;
      //Cuando apenas agregue un elemento
      if(Siguiente==1){
          Frente=0;
      }
    }
    public boolean colaVacia(){
        if(Frente==Siguiente){
            return true;
        }else if(Frente==-1){
             return true;
        }else{
            return false;    
           }
    }
    public T sacar()throws ExcepcionColaVacia{
        if(colaVacia()){
            throw new ExcepcionColaVacia();
        }
        T valor=Esquina[Frente];
        Frente++;
        return valor;
    }
   
   
}

