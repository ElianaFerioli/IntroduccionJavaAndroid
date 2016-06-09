/**
 * Created by SamsungAndroid on 07/06/2016.
 */
import java.util.Scanner;
public class Ej9_RP1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = 6, b = 14;
        int auxiliar;
        System.out.println("a vale " + a + " y b vale "+ b);
        // ¿Qué hacen estas tres sentencias?
        /*auxiliar = a;
        a = b;
        b = auxiliar;*/
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a vale " + a + " y b vale "+ b);

        teclado.close();
        /*
        Primer caso: Este programa intercambia los valores de a y b usando un auxiliar
        Segundo caso: Este programa intercambia los valores de a y de b asignandole a a el valor de la suma y luego restando los valores de b
        */
    }
}
