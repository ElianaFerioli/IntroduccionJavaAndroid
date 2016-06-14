import java.util.Scanner;

/**
 * Diseña un algoritmo que lea de teclado dos cadenas de caracteres cadena1 y cadena2, que
 contienen exclusivamente letras mayúsculas, y muestre como salida por pantalla dos
 valores: cántos caracteres de cadena2 se encuentran en cadena1 en la misma posición; y
 cuántos caracteres de cadena2 aparecen en cadena1 en una posición diferente.

 * Created by Eliana on 14/06/2016.
 */
public class Ej2_ADICIONALES {
    public static void main(String[] args) {
        System.out.println("Este programa cuenta cuántos caracteres coinciden entre dos cadenas.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca una cadena de caracteres: ");
        String cadenaUno = s.nextLine();
        System.out.print("Por favor, introduzca otra cadena de caracteres: ");
        String cadenaDos = s.nextLine();
        System.out.println("Las cadenas tienen " + caracteresEnMismaPosicion(cadenaUno, cadenaDos) + "" +
                " en la misma posicion y " + caracteresEnComun(cadenaUno, cadenaDos) + " en común.");
    }
    //Funciones
    /*
     *Determina cuántas coincidencias de caracteres existen en una misma posición
     */
    private static int caracteresEnMismaPosicion(String uno, String dos){
        int mismaPosicion = 0;
        int j = 0;
        if(dos.length()<=uno.length()){
            j = dos.length();
        } else {
            j = uno.length();
        }
        for(int x = 0; x < j; x++){
            String letraUno = "" + uno.charAt(x);
            String letraDos = "" + dos.charAt(x);
            if(letraUno.equals(letraDos)){
                mismaPosicion++;
            }
        }
        return mismaPosicion;
    }

    /*
     *Determina cuántos caracteres tienen en común las cadenas (sin tener en cuenta las de misma posicion)
     */
    private static int caracteresEnComun(String uno, String dos){
        StringBuilder cadenaUno = new StringBuilder(uno);
        StringBuilder cadenaDos = new StringBuilder(dos);
        int mismoCaracter = 0;
        int j = 0;
        int h = 0;
        if(dos.length()<=uno.length()){
            j = dos.length();
        } else {
            j = uno.length();
        }
        //Quita los caracteres en la misma posicion
        if(caracteresEnMismaPosicion(uno, dos)>0) {
            for (int i = 0; i < j; i++) {
                String luno = "" + uno.charAt(i);
                String ldos = "" + dos.charAt(i);
                if (luno.equals(ldos)) {
                    cadenaDos.replace((i-h), (i + 1), "");
                    cadenaUno.replace((i-h), (i + 1), "");
                    h++;
                }
            }
        }
        //quita los caracteres repetidos de cadenados
        dos = cadenaDos.toString();
        dos = quitaRepetidos(dos);
        //Se fija si existen caracteres en comun
        uno = cadenaUno.toString();
        for(int x = 0; x <dos.length(); x++){
            String l = "" + dos.charAt(x);
            if(uno.contains(l)){
                mismoCaracter++;
            }
        }
        return mismoCaracter;
    }

    /*
     *Quita caracteres repetidos
     */
    private static String quitaRepetidos(String cadena){
        String nuevaCadena = "";
        for(int x = 0; x < cadena.length(); x++){
            String nuevo = cadena.substring(x+1);
            String l = "" + cadena.charAt(x);
            if(!nuevo.contains(l)){
                nuevaCadena = nuevaCadena + l;
            }
        }
        return nuevaCadena;
    }
}
