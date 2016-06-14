import java.util.Scanner;

/**
 *
 * Un número es permutación de otro cuando tienen los mismos dígitos, aunque dispuestos en
 orden diferente. Por ejemplo el número 23243 es una permutación de 32432. Se puede
 considerar que un número es permutación de sí mismo. Diseña un programa que lea por
 teclado un número natural mayor que cero (primero) y después una secuencia de números
 naturales terminada en cero. El programa mostrará por pantalla la cantidad de números de
 dicha secuencia que son una permutación de primero.
 * Created by SamsungAndroid on 14/06/2016.
 */
public class Ej1_ADICIONALES {
    public static void main(String[] args) {
        System.out.println("Este programa establece si existen números que sean permutación de otros.");
        Scanner s  = new Scanner(System.in);
        int num = 0;

        System.out.print("Por favor, introduzca un número natural mayor a 0: ");
        num = s.nextInt();

        System.out.print("Por favor, introduzca una secuencia de números que termine en 0: ");
        int secuencia = 0;
        int cuentaPermutaciones = 0;
        do{
            secuencia = s.nextInt();
            if(esPermutacion(secuencia, num)){
                cuentaPermutaciones++;
            }
        }while(secuencia!=0);
        System.out.println("En esta secuencia existen " + cuentaPermutaciones + " números que son permutaciones del" +
                "número introducido.");
    }
    //Funciones
    /*
     *Verifica si un número es permutación de otro.
     */
    private static boolean esPermutacion(int num, int sec){
        boolean esPermutacion = false;
        int coincidencias = 0;
        int numero = num;
        int secuencia = sec;
        if(cuentaDigitos(num)==cuentaDigitos(sec)) {
            while (sec >= 1) {
                int digito = sec % 10;
                if (buscaDigito(num, digito)) {
                    coincidencias++;
                }
                sec = sec / 10;
            }
            if (coincidencias == cuentaDigitos(num)) {
                coincidencias = 0;
                for(int x = 0; x < cuentaDigitos(num); x++){
                    int i = numero % 10;
                    if(buscaRepeticiones(num, i)==buscaRepeticiones(secuencia, i)){
                        coincidencias++;
                    }
                    numero = numero/10;
                }
                if(coincidencias==cuentaDigitos(num)) {
                    esPermutacion = true;
                }
            }
        }
        return esPermutacion;
    }
    /*
     *Busca un dígito dentro de un número
     */
    private static boolean buscaDigito(int numero, int digito){
        boolean contieneDigito = false;
        while((!contieneDigito)&&(numero>0)){
            int x = numero%10;
            if(x==digito){
                contieneDigito =  true;
            } else {
                numero= numero/10;
            }
        }
        return contieneDigito;
    }
    /*
     *Cuenta la longitud de un número
     */
    private static int cuentaDigitos(int num){
        int longitud = 0;
        while(num > 0){
            num = num/10;
            longitud++;
        }
        return longitud;
    }

    /*
     *Busca cuántas veces se repite un número
     */
    private static int buscaRepeticiones(int num, int dig){
        int repeticiones = 0;
        int j = cuentaDigitos(num);
        for(int x = 0; x < j; x++){
            int d = num%10;
            if(d==dig){
                repeticiones++;
            }
            num = num/10;
        }
        return repeticiones;
    }
}
