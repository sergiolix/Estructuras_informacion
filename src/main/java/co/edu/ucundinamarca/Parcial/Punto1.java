
package co.edu.ucundinamarca.Parcial;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Punto1 {
    private Nodo inicio;
    public void Lista(){
        inicio = null;
        
    }
    public void Punto1(){
    
    }
    public boolean esVacia(){
        return inicio == null;
    }
    
  public void agregar(int valor){
      
      
        
        Nodo nuevo = new Nodo();
        
        nuevo.setValor(valor);
        
        if (esVacia()) {
           
            inicio = nuevo;
        
        } else{
            
            Nodo aux = inicio;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            
            aux.setSiguiente(nuevo);
        }
      


  }  
  public void mostrarlista(){
     if (!esVacia()) {
            
            Nodo aux = inicio;
            int i = 0;
            while(aux != null){
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }

  
    
  public void mayornumero(){
      if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            int auxiliardos=0;
            while(aux != null){
                if(auxiliardos >= aux.getValor()){
                     auxiliardos = auxiliardos;
                }else{
                    auxiliardos = aux.getValor();
                   
                }
                aux = aux.getSiguiente();
            }
            System.out.println("El numero mayor es :" +auxiliardos);
       }


  } 
  public void numerorepetido(){
    if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            int auxiliardos=0;
            while(aux != null){
                if(auxiliardos >= aux.getValor()){
                     auxiliardos = auxiliardos;
                }else{
                    auxiliardos = aux.getValor();
                   
                }
                aux = aux.getSiguiente();
            }
            System.out.println("El numero mayor es :" +auxiliardos);
       }
  
  
  
  
  }
  public boolean buscar(int referencia){
        
        Nodo aux = inicio;
        boolean encontrado = false;
        
        while(aux != null && encontrado != true){
            
            if (referencia == aux.getValor()){
                encontrado = true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
        
        return encontrado;
  }
}


