
package co.edu.ucundinamarca.taller1;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"las vidas son 5");
        int vidas =5;        
        juego juego1 = new juego(vidas);
        juego1.MuestraVidasRestantes();
        JOptionPane.showMessageDialog(null,"se perdio una vida");
        juego1.QuitarVida();
        juego1.MuestraVidasRestantes();
        juego1.QuitarVida();
        juego1.MuestraVidasRestantes();
        juego1.Reiniciapartida();
        juego1.MuestraVidasRestantes();
        
    }

}