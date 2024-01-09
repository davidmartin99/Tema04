package individuo;

/**
 * Calcular la poblacion, cada vez que se añade un individuo 
 * @author David
 */
public class Individuo {
    String dni, nombre;
    int fechaNacimiento, poblacion;
    
    public Individuo(){} //Metodo Constructor 1
    
    public Individuo(String dni,String nombre, int fechaNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }//Metodo Constructor 2
    
    public void setDni (String dni){
        this.dni = dni;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setFechaNacimiento(int fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public int getFechaNacimiento(){
        return fechaNacimiento;
    }

}
