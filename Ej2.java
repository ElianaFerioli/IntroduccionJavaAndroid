import java.util.Arrays;
import java.util.Scanner;

/**
 * Diseña una función leer que reciba como parámetro un objeto Scanner asociado al
 * teclado, lea del mismo una colección de números naturales (se introducirá un número
 * negativo para terminar) y devuelva un array conteniendo dicha colección. Diseña
 * también una función criba que recibe como parámetros un array de números enteros
 * y un número natural x. La función devolverá un array que contendrá sólo aquellos
 * números del array recibido como parámetro que están repetidos x veces. En el array
 * devuelto no habrá elementos repetidos.
 *
 * Created by Eliana Mariel Ferioli Núñez on 17/06/2016.
 */
public class Ej2 {
    public static void main(String[] args) {
        System.out.println("Este programa criba un array de acuerdo a un número de repeticiones.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la cantidad de veces que debe repetirne un número: ");
        int x = s.nextInt();
        int[] coleccion = leer(s);
        System.out.println("Los números introducidos que se repiten " + x + " son: ");
        coleccion = criba(coleccion, x);
        System.out.println(Arrays.toString(coleccion));
    }
    //Funciones
    /*
     * Le una secuencia de números y la devuelve en un array
     */
    private static int[] leer(Scanner s){
        int j = 1;
        int[] a = new int[j];
        System.out.println("Para finalizar la lectura introduzca un número negativo.");
        System.out.print("Por favor introduzca una secuencia: ");
        int x = 0;
        a[x] = s.nextInt();
        //Pide números hasta que se introduzca un número negativo
        while(a[x]>=0){
            j++;
            a = Arrays.copyOf(a,j);
            x++;
            a[x] = s.nextInt();
        }
        j--;
        a = Arrays.copyOf(a, j);
        return a;
    }
    /*
     * Criba un array por repeticiones
     */
    private static int[] criba(int[] a, int x){
        int h = 0;
        int[] repeticiones = new int[h];
        //Devuelve cada número del array
        for(int i = 0; i < a.length; i++){
            int contador = 0;
            //Verifica cuántas veces se repite ese número
            for(int j = 0; j < a.length; j++){
                if(a[i]==a[j]){
                    contador++;
                }
            }
            //Si se repite x veces se guarda en el array repeticiones
            if(contador==x){
                if(Arrays.binarySearch(repeticiones, a[i])<0) {
                    repeticiones = Arrays.copyOf(repeticiones, h + 1);
                    repeticiones[h] = a[i];
                    h++;
                }
            }
        }
        Arrays.copyOf(repeticiones, h - 1);
        return repeticiones;
    }
}
