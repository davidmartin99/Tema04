package radioDigital;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("""
                           ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐
                           ⭐⭐⭐ ♫♪♬🎶RADIO♫♪♬🎶 ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐
                           ⭐⭐⭐ autor: David Martin Pulgar ⭐⭐⭐
                           ⭐⭐⭐ version: 1.0 ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐
                           ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐
                           """);

        RadioDigital radio1 = new RadioDigital();
        
        radio1.mostrarEmisoraFavorita();
        
        Menu menuPrincipal = new Menu();
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            menuPrincipal.Menu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    radio1.subirFrecuencia();
                    break;
                case 2:
                    radio1.bajarFrecuencia();
                    break;
                case 3:
                    System.out.println("--- Exit... ---");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3);

    }
}
