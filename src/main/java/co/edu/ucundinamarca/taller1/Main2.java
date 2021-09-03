
package co.edu.ucundinamarca.taller1;


public class Main2 {
    
    
    public static void main(String[] args) {
         int vidas=5;
     
        juego juego1 = new juego(vidas);
        
        juego1.MuestraVidasRestantes();
        juego1.QuitarVida();
        juego1.MuestraVidasRestantes();
        juego1.Reiniciapartida();
        juego1.MuestraVidasRestantes();
        juego1.Actualizarecord();
        
        juego1.QuitarVida();  
        juego1.QuitarVida();  
        juego1.QuitarVida();  
        juego1.QuitarVida();  
        juego1.QuitarVida();  
        
        
    }
}
