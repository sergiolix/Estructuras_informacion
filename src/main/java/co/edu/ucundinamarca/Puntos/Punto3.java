
package co.edu.ucundinamarca.Puntos;

/**
 *
 * @author Sergio
 */
public class Punto3 extends Nodo2 {
  Nodo2 head, tail;
  int size;

  public Punto3() {
    head = new Nodo2();
    tail = new Nodo2();
    head.setNext(tail);
    tail.setPrev(head);
    size = 0;
  }

  public void insertFirst(Object obj) {
    Nodo2 h = head;
    Nodo2 node = new Nodo2();
    node.setVal(obj);
    node.setNext(h);
    h.setPrev(node);
    head = node;
    if (size == 0)
      tail = node;
    size++;

  }

  public void insertLast(Object obj) {
    Nodo2 t = tail;
    Nodo2 node = new Nodo2();
    node.setVal(obj);
    node.setPrev(t);
    t.setNext(node);
    tail = node;
    if (size == 0)
      head = node;
    size++;
  }

  public Object removeFirst() {
    if (head == null)
      return null;
    Object val = head.getVal();
    head = head.getNext();
    size--;
    return val;
  }

  public Object removeLast() {
    if (tail == null)
      return null;
    Object val = tail.getVal();
    tail = tail.getPrev();
    size--;
    return val;
  }

  public int size() {
    return size;
  }

  public String toString() {
    String s = "head [";
    Nodo2 aux = head;
    for (int i = 0; i < size; i++) {
      s += aux.getVal();
      if (aux == tail) {
        break;
      }
      s += "-";
      aux = aux.getNext();
    }
    return s + "] tail";
  }

}