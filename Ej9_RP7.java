import java.util.Arrays;
import java.util.Scanner;

/**
 *  Escriba un programa que efectúe la conversión de un número natural en base 10 a otra
 determinada base, sabiendo que el resultado no sobrepasará los 50 dígitos. El usuario
 introducirá primero el número en base 10 y después la base a la que convertirlo (el programa
 debe asegurarse de que la base no sea ni menor de 2 ni mayor de 9).
 * Created by SamsungAndroid on 16/06/2016.
 */
public class Ej9_RP7 {
    static final int MAX = 50;
    public static void main(String[] args) {
        System.out.println("Este programa convierte un número en base 10 a otra base.");
        Scanner s = new Scanner(System.in);
        int[] nuevaBase;
        System.out.print("Por favor, introduzca un número natural: ");
        int num = s.nextInt();
        System.out.print("Por favor, introduzca la base: ");
        int base = s.nextInt();
        while((base<2)||(base>9)){
            System.out.print("La base debe ser mayor a 2 y menor a 9: ");
            base = s.nextInt();
        }
        nuevaBase = convierteBase(num, base);
        nuevaBase = invierteArray(nuevaBase);
        System.out.println("El número resultante es: ");
        System.out.println(Arrays.toString(nuevaBase));
    }
    //Funciones
    /*
     *Convierte a base
     */
    private static int[] convierteBase(int num, int base){
        int[] nuevaBase = new int[MAX];
        int contador = 0;
        int cociente = num;
        while(cociente > 0){
            nuevaBase[contador] = cociente%base;
            cociente = cociente/base;
            contador++;
        }
        nuevaBase = Arrays.copyOf(nuevaBase, contador);
        return nuevaBase;
    }
    /*
     *Invierte el contenido de un array
     */
    private static int[] invierteArray(int[] a){
        int contador = a.length - 1;
        for(int x = 0; x < (a.length/2); x++){
            int aux = a[x];
            a[x] = a[contador];
            a[contador] = aux;
            contador--;
        }
        return a;
    }
}
