import java.util.Scanner;

/**
 *
 * Diseña un algoritmo que lea un texto y determine de cuántas palabras es anagrama la
 primera que aparece dentro de dicho texto.
 * Created by SamsungAndroid on 14/06/2016.
 */
public class Ej4_RP6 {
    public static void main(String[] args) {
        System.out.println("Este programa determina cuántas palabras de un texto son anagramas de la primer palabra introducida.");
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca un texto: ");
        String primerPalabra = s.next();
        String palabra = "";
        int contador = 0;
        do {
            palabra = s.next();
            if (buscaAnagrama(primerPalabra, palabra)) {
                contador++;
            }
        } while (!palabra.equals("FIN"));
        System.out.println("En este texto existen " + contador + " palabras que son anagramas de la primer palabra.");
    }

    //Funciones
    private static boolean buscaAnagrama(String palabra, String cadena) {
        boolean esAnagrama = false;
        int contiene = 0;
        if(palabra.length()==cadena.length()) {
            for(int x = 0; x < cadena.length(); x++){
                String letra = "" + palabra.charAt(x);
                if(cadena.contains(letra)){
                    contiene++;
                }
            }
        }
        if(contiene==palabra.length()) {
            esAnagrama = true;
        }
        return esAnagrama;
    }
}