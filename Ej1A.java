import java.util.Scanner;

/**
 * Dos números a y b se dice que son familia si la suma de los divisores de a (salvo él
 * mismo) coincide con b y viceversa (la suma de los divisores de b coincide con a). Por
 * ejemplo los números 220 y 284 son familia.
 * Diseña un programa que tenga como entrada de teclado dos números naturales
 * a y b y que muestre en la pantalla un mensaje indicando si son familia o no.
 * Por ejemplo, para los números 220 y 284 el mensaje sería que sí son familia,
 * en cambio para los números 100 y 150 el mensaje sería que no son familia.
 * Created by Eliana Mariel Ferioli Núñez on 17/06/2016.
 */
public class Ej1A {
    public static void main(String[] args) {
        System.out.println("Este progra determina si dos números son familia.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número natural: ");
        int a = s.nextInt();
        System.out.print("Por favor, introduzca otro número natural: ");
        int b = s.nextInt();
        if(sonFamilia(a, b)){
            System.out.println("El número " + a + " el número " + b + " son familia.");
        } else {
            System.out.println("Los números introducidos no son familia.");
        }
    }
    //Funciones
    /*
     * Determina si dos números son familia
     */
    private static boolean sonFamilia(int a, int b){
        int suma = 0;
        boolean sonFamilia = false;
        //Verifica cuál es la suma de los divisores
        for(int x = 1; x < a; x++){
            if((a%x)==0){
                suma = suma + x;
            }
        }
        //Si la suma es igual al otro número verifica la suma de los divisores del otro número
        if(suma==b){
            suma = 0;
            for(int x = 1; x < b; x++){
                if((b%x)==0){
                    suma = suma + x;
                }
            }
            //Si la suma de los divisores de B es igual a A devuelve verdadero
            if(suma==a){
                sonFamilia = true;
            }
        }
        return sonFamilia;
    }
}

