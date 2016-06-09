import java.util.Scanner;

/**
     Escriba un programa que lea de teclado un número natural, que representa una cierta
     cantidad de Bytes, y muestre por pantalla los MBytes, KBytes y Bytes que podemos obtener.
     Por ejemplo, dado el número 26871979, el resultado sería 25 MBytes, 642 KBytes y 171
     Bytes, ya que 26871979 Bytes = 25 MBytes + 642 KBytes + 171 Bytes.
 */
public class Ej7_RP1 {
    public static void main(String[] args) {
        System.out.println("Este programa convierte una cantidad de bytes a MB, KB y Bytes.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca una cantindad: ");
        int cantidad = s.nextInt();
        int bytes = cantidad%1024;
        int kiloBytes = (cantidad%(1024*1024))/1024;
        int megaBytes = cantidad / (1024*1024);
        System.out.println("La cantidad de megabytes es: " + megaBytes);
        System.out.println("La cantidad de kilobytes es: " + kiloBytes);
        System.out.println("La cantidad de bytes es: " + bytes);
        s.close();
    }
}
