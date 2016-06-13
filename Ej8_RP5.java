import java.util.Scanner;

/**
 * La conjetura de Goldbach dice que todo número par mayor que 2 tiene la propiedad de que
 es la suma de dos números primos. Diseña un algoritmo que compruebe si dicha conjetura
 es cierta para todos los números pares comprendidos entre dos números leídos por teclado.

 * Created by Eliana on 13/06/2016.
 */
public class Ej8_RP5 {
    public static void main(String[] args) {
        System.out.println("Este programa comprueba la conjetura de Goldbach.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca el límite inferior de a comprobación: ");
        int limiteInf = s.nextInt();
        System.out.print("Por favor, introduzca el límite superior de la comprobación: ");
        int limiteSup = s.nextInt();
        System.out.println(conjetura(limiteInf, limiteSup));
    }
    //Funciones
    /*
     * Establece si un número es primo
     */
    private static boolean esPrimo(double x){
        double raiz = Math.sqrt(x);
        boolean esPrimo = true;
        for(double i = 2.0; (i <= raiz)&&(esPrimo); i++){
            if((x%i)==0.0){
                esPrimo = false;
            }
        }
        return esPrimo;
    }
    /*
     * Imprime n números primos
     */
    private static int devuelvePrimos(int x){
        double num = x;
        int contador = 0;
        while (contador < 1){
            num++;
            if(esPrimo(num)){
                contador++;
            }
        }
        return (int)num;
    }
    /*
     * comprueba si es par
     */
    private static boolean esPar(int x){
        boolean esPar = false;
        if((x%2)==0) {
            esPar = true;
        }
        return esPar;
    }

    /*
     * comprueba la conjetura
     */
    private static String conjetura(int inf, int sup){
        int x = inf + 1;
        int i = 1;
        int j = 1;
        int cuentaPares = 0;
        int cuentaValido = 0;
        boolean esValido = false;
        String resultado = "";
        while(x < sup){
            if(esPar(x)){
                cuentaPares++;
                while(i<x){
                    int primerPrimo = devuelvePrimos(i);
                    while((j<x)&&(!esValido)) {
                        int suma = primerPrimo + devuelvePrimos(j);
                        if (suma == x) {
                            resultado = resultado + primerPrimo + " " + devuelvePrimos(j) + " = " + suma + "\n";
                            esValido = true;
                            cuentaValido++;
                        } else {
                            j++;
                        }
                    }
                    i++;
                    j = 0;
                }
            }
            esValido = false;
            j = 2;
            i = 2;
            x++;
        }
        if(cuentaPares==cuentaValido){
            resultado = resultado + "Si se cumple la conjetura.";
        } else {
            resultado = resultado + "No se cumple la conjetura.";
        }
        return resultado;
    }
}
