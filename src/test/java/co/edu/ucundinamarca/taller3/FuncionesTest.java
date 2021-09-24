
package co.edu.ucundinamarca.taller3;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author sergio
 */
public class FuncionesTest {
    @Test
    public void testFactorial(){
    
    //Act
    int res = Funciones.factorial(5);
    //Assert
    assertEquals( 120, res);
    
    
    }
    
    @Test
    public void testFactorialRec(){
    //Act
    int res = (int) Funciones.factorialRec(5);
    //Assert
    assertEquals( 120, res);
    
    }
    
    
    
    
}
