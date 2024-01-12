package radio;

/**
 *
 * @author David
 */
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        //Creacion de Objetos
        Radio FM = new Radio(80,80,108);
        Radio AM = new Radio(80,80,108);
        Scanner teclado = new Scanner(System.in);
        Menu menuPrincipal = new Menu();
        int opcion;
        
        do{
            menuPrincipal.Menu();
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Introduce una frecuencia: ");
                    double frecuencia = teclado.nextDouble();
                    FM.setFrecuencia(frecuencia);
                    break;
                case 2:
                    FM.subirFrecuencia();
                    break;
                case 3: 
                    FM.bajarFrecuencia();
                    break;
                case 4:
                    FM.mostrarDatos();
                    break;
                case 5:
                    System.out.println("--- Exit... ---");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }while(opcion != 5);

    }
}
