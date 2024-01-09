package individuo;

/**
 * Calcular la poblacion, cada vez que se añade un individuo 
 * @author David
 */
public class Individuo {
    private String dni, nombre;
    private int fechaNacimiento;
    private static int poblacion; //static para que pueda ir cambiando 
    
    public Individuo(){} //Fin Metodo Constructor 1
    
    public Individuo(String dni,String nombre, int fechaNacimiento){
        super(); //Primera linea del metodo constructor que invoque a la clase superior que comparta el mismo tipo de parametrizacion
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        poblacion++; //Se asume que partira de valor 0
    }//Fin Metodo Constructor 2
    
    //Metodos GET y SET
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

}//Fin class
