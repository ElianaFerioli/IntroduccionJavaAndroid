import java.util.Scanner;

/**
     Escriba un programa que calcule la distancia recorrida por un vehículo que circula a una
     velocidad constante. El programa leerá por teclado la velocidad a la que circula el vehículo y
     el tiempo empleado y escribirá por pantalla la distancia recorrida en ese tiempo
 */
public class Ej5_RP1 {
    public static void main(String[] args) {
        System.out.println("El programa calcula la distancia que recorre un vehículo.");
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la velocidad a la que circula el vehículo: ");
        int velocidad = s.nextInt();
        System.out.print("Por favor, introduzca el tiempo en horas: ");
        int tiempo = s.nextInt();
        int distancia = velocidad * tiempo;
        System.out.println("La distancia recorrida es: " +  distancia + " km/hs");
        s.close();
    }
}
