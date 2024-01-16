package radioDigital;

/**
 *
 * @author David
 */

public class RadioDigital {
    private static class Emisora {
        
        private String nombre;
        private double frecuencia;
        
        //Metodos Constructores
        public Emisora() {
        } //Fin Metodo Constructor 1

        public Emisora(String nombre, double frecuencia) {
            this.nombre = nombre;
            this.frecuencia = frecuencia;
        }//Fin Metodo Constructor 2

        //Metodos SET Y GET
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setFrecuencia(double frecuencia) {
            this.frecuencia = frecuencia;
        }

        public double getFrecuencia() {
            return frecuencia;
        }
        
        //Metodos especificos de la clase
        @Override
        public String toString() {
            return nombre + " _ "+ frecuencia +"MHz.";
        }
    }//Fin clase Emisora
    
    
    private final Emisora[] emisora;
    private int emisoraFavorita;
    
    //Metodos Constructores
    public RadioDigital() {
        //Creacion de Array Objetos
        emisora = new Emisora[6];

        emisora[0] = new Emisora("Europa FM", 91.0);
        emisora[1] = new Emisora("Cadena Dial", 91.7);
        emisora[2] = new Emisora("Cadena 100", 99.5);
        emisora[3] = new Emisora("Rock FM", 101.7);
        emisora[4] = new Emisora("Kiss FM", 102.7);
        emisora[5] = new Emisora("Radio Marca Nacional", 103.5);
        
        emisoraFavorita = 4;
    } //Fin Metodo Constructor 1

    
    //Metodos especificos de la clase
    public void mostrarEmisoraFavorita() {
        System.out.println("Emisora favorita: "+emisora[emisoraFavorita]);
    }//Fin encenderRadio
    
    private void mostrarEmisoras(){
        System.out.println("Emisora actual: " + emisora[emisoraFavorita]);
        int emisoraSiguiente = emisoraFavorita +1;
        if(emisoraSiguiente >= emisora.length){
            emisoraSiguiente = 0;
        }
        System.out.println("Emisora siguiente: "+emisora[emisoraSiguiente]);
    }//Fin mostrarEmisoras

    public void subirFrecuencia() {
        if (emisoraFavorita < emisora.length -1){
            emisoraFavorita++;
        }
        else {
            emisoraFavorita = 0;
        }
        mostrarEmisoras();
    }//Fin subirFrecuencia
    
    public void bajarFrecuencia(){
        if (emisoraFavorita > 0){
            emisoraFavorita --;
        }
        else {
            emisoraFavorita = emisora.length -1;
        }
        mostrarEmisoras();
    }//Fin bajarFrecuencia


}
