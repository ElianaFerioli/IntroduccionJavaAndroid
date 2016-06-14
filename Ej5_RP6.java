import java.util.Scanner;

/**
 * Diseña un algoritmo que se comporte como una calculadora que pida repetidamente un
 operador de conjuntos y dos operandos que sean conjuntos de letras minúsculas y que
 escriba el resultado de la operación.
 * Created by SamsungAndroid on 14/06/2016.
 */
public class Ej5_RP6 {
    public static void main(String[] args) {
        System.out.println("Este programa opera con conjuntos de caracteres.");
        Scanner s = new Scanner(System.in);
        String operacion = "";
        System.out.print("Por favor introduzca el tipo de operación que desea (* - + &): ");
        operacion = s.nextLine();
        while(!operacion.equals("&")) {
            System.out.print("Por favor, introduzca el primer conjunto: ");
            String primerOperando = s.nextLine();
            System.out.print("Por favor, introduzca el segundo operando: ");
            String segundoOperando = s.nextLine();
            System.out.print("Resultado: ");
            if(operacion.equals("*")){
                System.out.println(uneConjuntos(primerOperando, segundoOperando));
            }
            if(operacion.equals("-")){
                System.out.println(diferenciaConjuntos(primerOperando, segundoOperando));
            }
            if(operacion.equals("+")){
                System.out.println(concatenaConjuntos(primerOperando, segundoOperando));
            }
            System.out.print("Por favor introduzca el tipo de operación que desea (* - + &): ");
            operacion = s.nextLine();
        }
    }
    //Funciones
    /*
     *Une dos conjuntos por lo que tienen en común
     */
    private static String uneConjuntos(String uno, String dos){
        String resultado = "";
        if(uno.length()>=dos.length()){
            for(int x = 0; x < uno.length(); x++) {
                String letra = "" + uno.charAt(x);
                if (dos.contains(letra)) {
                    resultado = resultado + letra;
                }
            }
        } else {
            for(int x = 0; x < dos.length(); x++) {
                String letra = "" + dos.charAt(x);
                if (uno.contains(letra)) {
                    resultado = resultado + letra;
                }
            }
        }
        return resultado;
    }
    /*
     * Busca la diferencia de dos conjuntos
     */
    private static String diferenciaConjuntos(String uno, String dos){
        String resultado = "";
        for(int x = 0; x < uno.length(); x++) {
            String letra = "" + uno.charAt(x);
            if(!dos.contains(letra)){
                resultado = resultado + letra;
            }
        }
        return resultado;
    }

    /*
     *Concatena dos conjuntos
     */
    private static String concatenaConjuntos(String uno, String dos){
        String resultado = "";
        if(uno.length()>=dos.length()){
            for(int x = 0; x < uno.length(); x++){
                String letraUno = "" + uno.charAt(x);
                if(x<dos.length()) {
                    String letraDos = "" + dos.charAt(x);
                    resultado = resultado + letraUno + letraDos;
                } else {
                    resultado = resultado + letraUno;
                }
            }
        } else {
            for(int x = 0; x < dos.length(); x++){
                String letraDos = "" + dos.charAt(x);
                if(x<uno.length()) {
                    String letraUno = "" + uno.charAt(x);
                    resultado = resultado + letraUno + letraDos;
                } else {
                    resultado = resultado + letraDos;
                }
            }
        }
        return resultado;
    }

}
