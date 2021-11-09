
package co.edu.ucundinamarca.Puntos;

/**
 *
 * @author Sergio
 */
public class Nodo2 {
  
  Nodo2 next, prev;
  Object val;

    public Nodo2() {

    this.next = null;
    this.prev = null;
    this.val = null;
  }

  public Nodo2(Object val, Nodo2 first, Nodo2 last) {

    this.next = first;
    this.prev = last;
    this.val = val;
  }

  public Nodo2 getNext() {
    return next;
  }

  public void setNext(Nodo2 next) {
    this.next = next;
  }

  public Nodo2 getPrev() {
    return prev;
  }

  public void setPrev(Nodo2 prev) {
    this.prev = prev;
  }

  public Object getVal() {
    return val;
  }

  public void setVal(Object val) {
    this.val = val;
  }

}
	  

