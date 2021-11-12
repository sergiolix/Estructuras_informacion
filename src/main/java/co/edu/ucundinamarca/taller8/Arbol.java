
package co.edu.ucundinamarca.taller8;

/**
 *
 * @author Sergio
 */
public class Arbol {
    Nodo raiz;
    public Nodo insertarRaiz(String dato){
        raiz = new Nodo(dato);
        return raiz;
    }
    public void Imprimir(Nodo nodo){
    for (int i= 0; i < nodo.nohijos;i++){
     nodo.hijos[i].verNodo();
     Imprimir(nodo.hijos[i]);
    }
    
    }
    
    public void Insertar(Nodo nodo, String dato, String padre){
    Nodo nuevo = new Nodo (dato); 
    if(nodo.getInfo().equals(padre))
    {
        nodo.aumentarhijo(nuevo);
    }else {
       for(int i=0; i< nodo.nohijos;i++){
         if(nodo.hijos[i].getInfo().equals(padre)){
            nodo.hijos[i].aumentarhijo(nuevo);
         }else{
            Insertar(nodo.hijos[i],dato,padre);
         }
       }
    }
    
    
    
    
    
    
    }
}
