import java.util.Scanner;

/**
 *
 * Diseña un algoritmo que permita traducir una cadena numérica al número natural que
 representa:
 * Created by SamsungAndroid on 14/06/2016.
 */
public class Ej2_RP6 {
    public static void main(String[] args) {
        System.out.println("Este programa traduce una cadena numérica al número natural que representa.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce una cadena de números: ");
        String cadenaNumeros = s.nextLine();
        System.out.println(cambiaCadenaPorNumero(cadenaNumeros));
    }
    //Funciones
    private static int cambiaCadenaPorNumero(String cadena){
        int numero = 0;
        String cadenaNueva = "";
        for(int x = 0; x < cadena.length(); x++){
            char c = cadena.charAt(x);
            cadenaNueva = cadenaNueva + c;
        }
        numero = Integer.parseInt(cadenaNueva);
        return numero;
    }
}
