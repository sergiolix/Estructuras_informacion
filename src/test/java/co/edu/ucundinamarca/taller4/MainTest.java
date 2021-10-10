
package co.edu.ucundinamarca.taller4;




import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

/**
 *
 * @author hortizr
 */
public class MainTest {

    @Test
    public void testimprimirIterando() {
        
        Dulces.imprimirIterando(Dulces.ListaDulces);
        
        int Tamaño = Dulces.ListaDulces.size();
        
        assertEquals(10,Tamaño);
    }
    @Test
    public void testimprimirSinIterando(){
        
        Dulces.imprimirSinIterando(Dulces.ListaDulces);
        
        
        assertTrue(Dulces.ListaDulces.contains("Chocoramo"));
    
    
    }
    @Test
    public void estaVacia(){
        Nodo inicio = new Nodo();
        Object valoresperado = null;
        Object valor = inicio.ObtenerElemento();
        assertEquals(valoresperado, valor);}
    
    }


