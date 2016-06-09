import java.util.Scanner;
import java.util.Locale;
/**
 Escriba un programa que lea un número real por teclado. El programa deberá mostrar por
 separado la parte entera y la parte decimal de este número. Por ejemplo (en negrita los datos
 tecleados por el usuario):
 */
public class Ej6_RP1 {
    public static void main(String[] args) {
        System.out.println("Este programa muestra la parte entera y la parte decimal de un número real.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número de tipo real: ");
        double numeroReal = s.useLocale(Locale.ENGLISH).nextDouble();
        int entero = (int)numeroReal;
        double decimal = numeroReal - entero;
        System.out.println("La parte entera es: " + entero);
        System.out.println("La parte decimal es: " + decimal);
        s.close();
    }
}
