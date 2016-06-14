import java.util.Scanner;

/**
 * . Escriba un programa que lea una palabra por teclado, y posteriormente muestre por pantalla
 dicha palabra pero sustituyendo cada uno de sus caracteres por aquel carácter que le sigue en
 la tabla de código ASCII. Por ejemplo, ante la entrada SETO debe producir la salida TFUP.

 *
 *
 * Created by SamsungAndroid on 14/06/2016.
 */
public class Ej1_RP6 {
    public static void main(String[] args) {
        System.out.println("Este programa reemplaza los caracteres de una palabra.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca una palabra: ");
        String palabra = s.nextLine();
        System.out.println(cambiaCaracter(palabra));
    }

    //Funciones
/*
 * Cambia caracter por el siguiente
 */
    private static String cambiaCaracter(String palabra) {
        String nuevaPalabra = "";
        for (int x = 0; x < palabra.length(); x++) {
            int i = palabra.codePointAt(x) + 1;
            char c = (char) i;
            nuevaPalabra = nuevaPalabra + c;
        }
        return nuevaPalabra;
    }
}
