import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenidos al juego de adivinanzas!");

        Random random = new Random();
        int aleatorio = random.nextInt(100);

        Scanner datos = new Scanner(System.in);
        int datosUsuario;
        int intentos = 0;

        reinciarClico:
        while(true){
            System.out.println("Ingresa un número entre 0 y 100:");
            datosUsuario = datos.nextInt();
            intentos++;
            System.out.println("intento " + intentos + " de 5 posibles");
            if (intentos == 5){
                System.out.println("Superaste la cantidad de intentos posibles, buena suerte para la próxima! :(");
                break;
            }
            if (datosUsuario > aleatorio){
                System.out.println("Es menor que " + datosUsuario);
                continue reinciarClico;
            }else if(datosUsuario < aleatorio){
                System.out.println("Es mayor que " + datosUsuario);
                continue reinciarClico;
            }else {
                System.out.println("El número ingresado es correcto!!");
                break;
            }
        }
    }
}