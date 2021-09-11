package co.edu.ucundinamarca.taller2;

import static co.edu.ucundinamarca.taller2.MainPersona.log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SeleccionColombia {

    public SeleccionColombia() {
    }
    private static final Logger LOG = Logger.getLogger(SeleccionColombia.class.getName());

    ArrayList<String> Jugadores = new ArrayList<String>();

    public void Agregarjugador() {
        String jugador = JOptionPane.showInputDialog("ingrese nombre del jugador:");
        Jugadores.add(jugador);

    }

    public void mostrarjugadores() {
        log.info(Jugadores);
    }

    public void contienejugador() {
        String jugador = JOptionPane.showInputDialog("ingrese nombre del jugador a buscar:");
        int buscar = Jugadores.indexOf(jugador);
        
        
        if (buscar != -1){
           log.info("se encontro jugador");
        }else{
           log.info("no se encontro jugador");
        }
    
    }

}
