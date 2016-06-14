import java.util.Scanner;

/**
 * Diseñe un algoritmo lea de teclado un texto y muestre un listado por pantalla de todas las
 palabras del texto que comiencen por ciertas iniciales. Dichas iniciales serán las letras que
 formen la primera palabra del texto
 *
 * Created by SamsungAndroid on 14/06/2016.
 */
public class Ej3_RP6 {
    public static void main(String[] args) {
        System.out.println("Este programa muestra un listado de todas las palabras de un texto que aparecen con ciertas iniciales.");
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca un texto: ");
        String  primerPalabra = s.next();
        String palabra = "";
        String listado = "";
        while(!palabra.equals("FIN")){
            palabra = s.next();
            if(buscaIniciales(primerPalabra, palabra)){
               listado = listado + palabra + "\n";
            }
        }
        System.out.println("El listado de palabras que contienen alguna letra de la primer palabra es: ");
        System.out.println(listado);
    }
    //Funciones
    private static boolean buscaIniciales(String primer, String palabra){
        boolean contiene = false;
        String letra = "" + palabra.charAt(0);
        if(primer.contains(letra)){
            contiene = true;
        }
        return contiene;
    }
}
