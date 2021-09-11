
package co.edu.ucundinamarca.taller2;

import java.util.Objects;


public class Persona {
    
    private String nombre;
    private int edad;
    private int altura;
    private int identificacion;

    public Persona(String nombre, int edad, int altura, int identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
    public int hashCode() {
        int result = 17;
        result = 31 * result + getEdad();
        result = 31 * result + getIdentificacion();
        return result;
    }
    
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Persona that = (Persona) obj;
        return Objects.equals(this.getNombre(), that.getNombre())&& Objects.equals(this.getEdad(), that.getEdad()) && Objects.equals(this.getIdentificacion(), that.getIdentificacion()) && Objects.equals(this.getAltura(), that.getAltura());
    
    
    
    
    }
    
    
    
}
