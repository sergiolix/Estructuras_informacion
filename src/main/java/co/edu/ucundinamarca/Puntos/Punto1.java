
package co.edu.ucundinamarca.Puntos;

/**
 *
 * @author Sergio
 */
public class Punto1 {
    private Nodo inicioCola, finalCola;
    String cola = "";
    
    
    public Punto1(){
    inicioCola = null;
    finalCola= null;
    }
    
    
    public boolean ColaVacia()
    {
    if (inicioCola==null){
       return true;
    }
    else {
       return false;
    }
 }
    
    public void Insertar(int id ){
     Nodo nuevo_nodo  = new Nodo();
     nuevo_nodo.id= id;
    }
    
}
