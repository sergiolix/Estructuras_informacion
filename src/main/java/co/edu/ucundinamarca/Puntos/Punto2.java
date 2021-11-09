package co.edu.ucundinamarca.Puntos;

/**
 *
 * @author Sergio
 */
public class Punto2 {

    class Nodo {

        Object elem;
        Nodo siguiente;

        public Nodo(Object o) {
            elem = o;
            siguiente = null;
        }

        public Object getElem() {
            return elem;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        

    }
    Nodo end;
    int size;

    public Punto2() {
        end = null;
        size = 0;
    }

    public void agregar(Object o) {
        Nodo new_node = new Nodo(o);
        if (end == null) {
            end = new_node;
        } else {
            new_node.siguiente = end;
            end = new_node;
        }
        size++;
    }

    ; 

  public Object recuperar() {
        if (end == null) {
            return null;
        }
        ;
        Object o = end.elem;
        end = end.siguiente;
        size--;
        return o;
    }

    public boolean estavacia() {

        return (size == 0);
    }

    public int tamano() {

        return size;
    }

    public Object end() {

        if (end == null) {
            return null;
        } else {
            return end.elem;
        }
    }

    public void listar() {

        Nodo aux = end;
        // Recorre la pila hasta el ultimo nodo.
        while (aux != null) {
            System.out.println("|\t" + aux.getElem() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
}
