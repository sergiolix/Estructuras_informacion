package co.edu.ucundinamarca.taller1;

import javax.swing.JOptionPane;

public class juego {

    private int vidas_jugador;

    public juego(int vidas_jugador) {
        this.vidas_jugador = vidas_jugador;
    }

    juego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getVidas_jugador() {
        return vidas_jugador;
    }

    public void setVidas_jugador(int vidas_jugador) {
        this.vidas_jugador = vidas_jugador;
    }

    public void MuestraVidasRestantes() {
        JOptionPane.showMessageDialog(null, "tus vidas son:" + vidas_jugador);
    }

    public void QuitarVida() {
        if (vidas_jugador == 0) {
            JOptionPane.showMessageDialog(null, "Se acabo la partida");
        } else {
            vidas_jugador = vidas_jugador - 1;
        }
    }

    public void Reiniciapartida() {
        vidas_jugador=5;
    }
}



