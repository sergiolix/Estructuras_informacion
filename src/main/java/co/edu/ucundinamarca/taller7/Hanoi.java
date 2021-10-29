
package co.edu.ucundinamarca.taller7;


public class Hanoi {
    
    
    public void Hanoi(int num, int Torreinicio,int Torretemp, int Torrefin)
    {
    
        if(num == 1){
        System.out.println("Moviendo a la torre de inicio "+Torreinicio+" a la Torre de destino "+Torrefin);
        }else
        {
          Hanoi(num - 1, Torreinicio, Torrefin, Torretemp);
          System.out.println("Moviendo a la torre de inicio "+Torreinicio+" a la Torre de destino "+Torrefin);
          Hanoi(num - 1, Torretemp, Torreinicio, Torrefin);
        }
    
    
    }
}

    
    

