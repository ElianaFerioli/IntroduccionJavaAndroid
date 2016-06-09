import java.util.Scanner;

/**
     Escriba un programa que sólo declare variables de tipo int. El programa deberá leer dos
     números desde el teclado; posteriormente los sumará y almacenará el resultado en una
     variable; finalmente escribirá por pantalla el resultado de la suma. Ejecute el programa con
     datos cualesquiera y verifique que funciona. Después ejecute dicho programa tomando como
     datos de entrada 1 y 3000000000. ¿Por qué no funciona?

 */
public class Ej3_RP1 {
    public static void main(String[] args) {
        System.out.println("Este programa lee dos números y los suma almacenando el resultado en una variable");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca el primer número: ");
        int numUno = s.nextInt();
        System.out.print("Por favor, introduzca el segundo número: ");
        int numDos = s.nextInt();
        int totalSuma = numUno + numDos;
        System.out.println("El total de la suma es: " + totalSuma);
        s.close();
        /*
        Cuando se ejecuta tomando como datos 1 y 3000000000 da un error de InputMismatchException porque el tipo de dato int no acepta números tan grandes
        en tal caso deberíamos poner long.
        */
    }
}
