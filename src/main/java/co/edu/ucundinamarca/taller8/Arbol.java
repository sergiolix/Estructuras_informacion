
package co.edu.ucundinamarca.taller8;

/**
 *
 * @author Sergio
 */
class Arbolp {
    Nodo raiz;
    public Nodo insertarRaiz(String dato){
        raiz = new Nodo(dato);
        return raiz;
    }
    public void Preorden(Nodo nodo){
    for (int i= 0; i < nodo.nohijos;i++){
     nodo.hijos[i].verNodo();
     Preorden(nodo.hijos[i]);
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
 

public class Arbol{
       public static void main (String[]args){
         Arbolp arbol = new Arbolp();
         Nodo nodo = arbol.insertarRaiz("A");
         arbol.raiz.verNodo();
         
         
         arbol.Insertar(nodo, "B", "A");
         arbol.Insertar(nodo, "C", "A");
         arbol.Insertar(nodo, "D", "A");
         arbol.Insertar(nodo, "E", "C");
         arbol.Insertar(nodo, "F", "C");
         arbol.Insertar(nodo, "G", "F");
         arbol.Preorden(nodo);
         arbol.raiz.InOrden(nodo);
         arbol.raiz.niveles(nodo);
       }
    
    
}