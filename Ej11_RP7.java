import java.util.Arrays;
import java.util.Scanner;

/**
 * Los alumnos de un curso de “Programación de Dispositivos Android” desean celebrar una
 comida un día del presente mes (marzo) en el que puedan acudir todos. Se pide realizar un
 algoritmo que recoja de cada alumno los días que le vendría bien ir a la comida, e imprima
 las fechas concordantes para todos los alumnos. Los datos se introducirán por teclado.
 Primero se introducirá el número de alumnos que intervienen. Después, por cada alumno se
 introducirá una única línea con los números de los días libres separados por espacios (un 0
 para terminar).

 * Created by SamsungAndroid on 16/06/2016.
 */
public class Ej11_RP7 {
    public static void main(String[] args) {
        System.out.println("Este programa establece qué fechas coinciden para distintos alumnos.");
        Scanner s = new Scanner(System.in);
        System.out.print("¿Cuantos alumnos deben ir a la comida?: ");
        int cantidad = s.nextInt();
        int[] fechas = leer(s, cantidad);
        fechas(fechas, cantidad);
    }
    //Funciones
    /*
     *Lee datos por teclado y los guarda en un array
     */
    private static int[] leer(Scanner s, int num){
        int[] a = new int[32];
        System.out.println("Se finaliza con un \"0\".");
        for(int x = 0; x < num; x++) {
            System.out.print("Introduce las fechas que puedes asistir separadas con espacios:");
            int fecha = Integer.parseInt(s.next());
            a[fecha] = a[fecha] + 1;
            while (fecha != 0) {
                fecha = Integer.parseInt(s.next());
                a[fecha] = a[fecha] + 1;
            }
        }
        a = Arrays.copyOfRange(a, 1, a.length);
        return a;
    }
    /*
     *Deteermina si existe una fecha en la que puedan todos los alumnos
     */
    private static void fechas(int[] a, int num){
        boolean sePuede = false;
        String f = "Las fechas que coinciden son los días ";
        for(int x = 0; x < a.length; x++){
            if(a[x]==num){
                f = f + (x+1) + "; ";
                sePuede = true;
            }
        }
        if(sePuede){
            System.out.println(f);
        }else{
            System.out.println("No existen fechas coincidentes.");
        }
    }
}

