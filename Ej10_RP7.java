import java.util.Scanner;

/**
 * Diseña un algoritmo que lea de teclado dos
 colecciones de números enteros (el usuario indicará en primer lugar la cantidad de números
 que va a introducir por cada colección y después las colecciones) y determine si son iguales
 conforme al criterio establecido anteriormente.
 * Created by SamsungAndroid on 16/06/2016.
 */
public class Ej10_RP7 {
    public static void main(String[] args) {
        System.out.println("Este programa determina si dos colecciones de número son iguales.");
        Scanner s = new Scanner(System.in);
        int[] colecUno;
        int[] colecDos;
        colecUno = leer(s);
        colecDos = leer(s);
        if(sonIguales(colecUno, colecDos)){
            System.out.println("Las colecciones introducidas son iguales.");
        } else {
            System.out.println("Las colecciones introducidas no son iguales.");
        }

    }
    //Funciones
    /*
     *Lee por teclado y devuelve array
     */
    private static int[] leer(Scanner s){
        System.out.print("¿Cuántos números desea introducir?: ");
        int max = s.nextInt();
        int[] array = new int[max];
        for(int x = 0; x < max; x++){
            System.out.print("Introduzca el " + (x + 1) + "º valor del array: ");
            array[x] = s.nextInt();
        }
        return array;
    }
    /*
     *Determina si dos colecciones son iguales
     */
    private static boolean sonIguales(int[] uno, int[] dos){
        boolean sonIguales = true;
        boolean existe = false;
        int i = 0;
        int x = 0;
        int j = 0;
        if(uno.length!=dos.length) {
            sonIguales = false;
        } else {
            //Verifica si el primero coincide en algún punto
            if(uno.length==dos.length){
                int aux = uno[x];
                while((!existe)&&(i < dos.length)){
                    if(x==0){
                        if (aux == dos[i]) {
                            existe = true;
                        } else {
                            i++;
                        }
                    }
                }
            }
            //si coinciden en el primero se sigue verificado
            if(existe){
                x++;
                while((sonIguales)&&(x<uno.length)) {
                    int aux = uno[x];
                    if (i <= (dos.length - 2)) {
                        i++;
                        if (aux != dos[i]) {
                            sonIguales = false;
                        }
                    } else {
                        i = j;
                        if (aux != dos[i]) {
                            sonIguales = false;
                        }
                        j++;
                    }
                    x++;
                }
            }
        }
        return sonIguales;
    }
}
