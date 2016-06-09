import java.util.Scanner;

/**
     Escriba un programa que acepte un dato de tipo int de teclado y posteriormente lo escriba en
     pantalla. Ejecútelo introduciendo un número int válido, y posteriormente ejecútelo
     introduciendo por teclado un dato que no pertenezca al tipo int, por ejemplo una palabra
     cualquiera. Añada un comentario al principio del programa en el que explique cuáles son las
     diferencias que ha encontrado entre ambas ejecuciones del mismo programa.
 */
public class Ej2_RP1 {
    public static void main(String[] args) {
        System.out.println("Este programa recoge un dato de tipo entero y lo imprime por pantalla.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int numeroIntroducido = s.nextInt();
        System.out.println("El número introducido es: " + numeroIntroducido);
        /*
        En el caso de que se introduzca un dato de tipo entero el programa se ejecuta sin problemas.
        Si se introduce otro tipo de dato el programa da un error de tipo "InputMismatchException"
        */
        s.close();
    }
}
