import java.util.Scanner;

/**
 * Dado un número natural, lo sumamos con su reverso. Si esta suma es un palíndromo,
 entonces paramos; y si no, repetimos el proceso con el número obtenido de dicha suma,
 hasta dar con un palíndromo. Si inicialmente el número del que partimos ya es
 palíndromo, no se hace nada.

 */
public class Ej3_RP5 {
    public static void main(String[] args) {
        System.out.println("Este programa genera palíndromos y los va sumando hasta encontrar el primer número capicúa.");
        Scanner  s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int num = s.nextInt();
        System.out.print("Por favor, introduzca un número de iteraciones: ");
        int iteraciones = s.nextInt();
        if(!esCapicua(num)) {
            int palindromo = buscaPalindromo(num, iteraciones);
            if (esCapicua(palindromo)) {
                System.out.println("En esate caso SI se cumple la conjetura, el palíndromo es: " + palindromo);
            } else {
                System.out.println("En esate caso NO se cumple la conjetura, tras hacer " + iteraciones + " iteraciones.");
            }
        } else {
            System.out.println("El número introducido es un palíndromo, no hace falta comprobación.");
        }

        s.close();
    }
    //Funciones////////////
    /*
     * Da vuelta un número
     */
    private static int daVuelta (int x) {
        int numero = x;
        //averigua la longitud del número
        int longitud = 0;
        while(x>0){
            x = x / 10;
            longitud++;
        }
        //da la vuelta al número
        int nuevoNum = 0;
        while(longitud>0){
            int digito = numero%10;
            numero = numero/10;
            nuevoNum = nuevoNum * 10 + digito;
            longitud--;
        }
        return nuevoNum;
    }
    /*
     * Averigua si un número es capicúa
     */
    private static boolean esCapicua(int x){
        int nuevoNum = daVuelta(x);
        boolean esCapicua = false;
        if(nuevoNum==x){
            esCapicua = true;
        }
        return esCapicua;
    }

    /*
     * Busca palíndromo
     */
    private static int buscaPalindromo(int x, int i){
        int volteado = daVuelta(x);
        int suma = x;
        boolean esPalindromo = false;
        for(int j = 0; ((j < i)&&(!esPalindromo)); j++){
            volteado = daVuelta(suma);
            suma = suma + volteado;
            esPalindromo = esCapicua(suma);
        }
        return suma;
    }
}
