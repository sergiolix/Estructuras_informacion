package co.edu.ucundinamarca.taller1;

import javax.swing.JOptionPane;

public class juego {

    private int vidas_jugador;
    private int record=0;
    private int reiniciar ;
    public juego(int vidas_jugador) {
        this.vidas_jugador = vidas_jugador;
        this.reiniciar = vidas_jugador;
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
        vidas_jugador = vidas_jugador - 1;
        if (vidas_jugador == 0) {
            JOptionPane.showMessageDialog(null, "Se acabo la partida");
        } else {
            JOptionPane.showMessageDialog(null, "Se quito una vida");
        }
    }

    public void Reiniciapartida() {
        vidas_jugador= reiniciar;
    }
    public void Actualizarecord(){
      if (vidas_jugador== record){
        JOptionPane.showMessageDialog(null, "Se alcanzo el record");
      }else if (vidas_jugador > record){
          record= vidas_jugador;
          JOptionPane.showMessageDialog(null, "Se a roto el record");
      }
      
          }
    
    }


