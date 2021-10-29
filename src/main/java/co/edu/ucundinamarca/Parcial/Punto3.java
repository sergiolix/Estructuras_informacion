
package co.edu.ucundinamarca.Parcial;

import java.util.ArrayList;
import java.util.function.Supplier;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import jdk.jpackage.internal.Log;

/**
 *
 * @author Sergio
 */
public class Punto3 {
     public Punto3() {
    }
    
    ArrayList<String> Jugadores = new ArrayList<String>();

    public void Agregar() {
        String soldado = JOptionPane.showInputDialog("ingrese nombre del jugador:");
        Jugadores.add(soldado);

    }

    public void mostrar() {
        System.out.println(Jugadores);
    }
    
    public void solucion(){
    
    
    }
}
