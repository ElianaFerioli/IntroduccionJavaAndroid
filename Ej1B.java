import java.util.Scanner;

/**
 * Diseña un programa que tenga como entrada de teclado dos números naturales
 * n y m y que muestre en la pantalla todas las parejas de números familia que
 * existan en el intervalo determinado por n y m. El programa debe asegurarse de
 * que n sea menor que m. Por ejemplo en el intervalo 1 – 2000 sólo existen dos
 * parejas de números familia: el 220 es familia del 284, y el 1184 es familia del
 * 1210.
 * Created by Eliana Mariel Ferioli Núñez on 17/06/2016.
 */
public class Ej1B {
    public static void main(String[] args) {
        System.out.println("Este programa muestra los números que son familia en un intervalo indicado.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int n = s.nextInt();
        System.out.print("Por favor, introduzca otro número: ");
        int m = s.nextInt();
        while(m<=n){
            System.out.println("El segundo número debe ser mayor al primero.");
            System.out.print("Por favor, vuelva a introducir otro número: ");
            m = s.nextInt();
        }
        buscaFamilia(n,m);
    }
    //Funiciones
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
    /*
     * Busca familia
     */
    private static void buscaFamilia(int n, int m){
        //Verifica número por número
        for(int x = n; x <= m; x++){
            int suma = 0;
            //Determina cuál es la suma de los divisores de cada número
            for(int i = 1; i < x; i++){
                if((x%i)==0){
                    suma = suma + i;
                }
            }
            //Siempre y cuando x sea menor a suma (no igual) realiza la comprobación recurriendo a la funcion sonFamilia
            if(x<suma){
                if(sonFamilia(x, suma)) {
                    System.out.println("Los números " + x + " y " + suma + " son familia.");
                }
            }
        }
    }
}
