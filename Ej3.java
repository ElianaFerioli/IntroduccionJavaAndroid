import java.util.Scanner;

/**
 * Diseña un algoritmo que lea de teclado una cadena de caracteres (patrón) y un texto, y
 * muestre por pantalla un listado de todas las palabras del texto que contengan la cadena
 * patrón de “forma relativa”. Esto significa que la palabra contendrá todas las letras de
 * la cadena patrón en el mismo orden, pero no tienen que estar dispuestas juntas.
 *
 * Created by Eliana Mariel Ferioli Núñez on 17/06/2016.
 */
public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Este programa busca un patrón de caractes de forma relativa.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca el patrón que desea buscar: ");
        String patron = s.nextLine();
        String listado = "";
        System.out.println("Por favor, introduzca un texto: ");
        String texto = "";
        //Pide palabras hasta que se se introduzca "FIN"
        while(!texto.equals("FIN")){
            texto = s.next();
            //Recurre a la función para ver si se cumple la condicion y si es correcto guarda la palabra en un string
            if(buscaPatron(texto, patron)){
                listado = listado + texto + "\n";
            }
        }
        System.out.println("El listado de palabras que contiene el patron de forma relativa es:");
        System.out.println(listado);
    }
    //Funciones
    /*
     * Busca un patrón de palabras de forma relativa
     */
    private static boolean buscaPatron(String palabra, String patron){
        String subPalabra = palabra;
        int contador = patron.length();
        boolean contienePatron = false;
        //Recorre el patron letra por letra
        for(int x = 0; x < patron.length(); x++) {
            String letraPatron = "" + patron.charAt(x);
            //Verifica si esa letra se encuentra en el substring de la palabra
            if (subPalabra.contains(letraPatron)) {
                int indice = palabra.indexOf(letraPatron);
                //crea un subtring con el respo de la palabra
                subPalabra = palabra.substring(indice);
                //Reduce el contador si hay coincidencia
                contador--;
            }
        }
        //Si el contador vale exactamente 0 entonces se devuelve verdadero
        if(contador==0){
            contienePatron = true;
        }
        return contienePatron;
    }
}
