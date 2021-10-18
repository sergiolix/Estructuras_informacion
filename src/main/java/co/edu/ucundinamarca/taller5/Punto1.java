package co.edu.ucundinamarca.taller5;


import javax.swing.JOptionPane;

public class Listalc {


    
     private Nodo inicio;
     private Nodo ultimo; 
     private int tamanio;
 

public void Lista(){
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }

public boolean esVacia(){
      return inicio == null;
    }

public int getTamanio(){
        return tamanio;
    }

 public void agregarAlFinal(int valor){
        
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
           inicio = nuevo;
           ultimo = nuevo;
           ultimo.setSiguiente(inicio);
       
        } else{
            
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo = nuevo;
        }
        tamanio++;
    }
     public void agregarAlInicio(int valor){
        
        Nodo nuevo = new Nodo();
     
        nuevo.setValor(valor);
     
        if (esVacia()) {
            
            inicio = nuevo;
           
            ultimo = nuevo;  
            
            ultimo.setSiguiente(inicio);
       
        } else{
          
            nuevo.setSiguiente(inicio);
            
            inicio = nuevo;
            
            ultimo.setSiguiente(inicio);
        }
       
        tamanio++;
    }
   
 public boolean buscar(int referencia){
        
        Nodo aux = inicio;
        
        boolean encontrado = false;
       
        do{
         
            if (referencia == aux.getValor()){
                
                encontrado = true;
            }
            else{
                
                aux = aux.getSiguiente();
            }
        }while(aux != inicio && encontrado != true);
        
        return encontrado;
    }

public void remover(int referencia){
        
        if (buscar(referencia)) {
           
            if (inicio.getValor() == referencia) {
               
                inicio = inicio.getSiguiente();
              
                ultimo.setSiguiente(inicio); 
            } else{
                
                Nodo aux = inicio;
               
                while(aux.getSiguiente().getValor() != referencia){
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == ultimo) {
                    aux.setSiguiente(inicio);
                    ultimo = aux;
                } else {
                  
                    Nodo siguiente = aux.getSiguiente();
                    
                    aux.setSiguiente(siguiente.getSiguiente());  
                  
                }
            }
            
            tamanio--;
        }
    }




  public void listar(){
        
        if (!esVacia()) {
            
            Nodo aux = inicio;
            
            int i = 0;
            System.out.print("-> ");
            
            do{
                
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
             
                aux = aux.getSiguiente();
               
                i++;
            }while(aux != inicio);
        }
    }

}   