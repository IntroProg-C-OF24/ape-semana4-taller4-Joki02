/*
Se debe generar un algoritmo que permite calcular y mostrar el valor total a 
pagar mensual 
de servicios digitales de una persona. 
Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 */
package taller.pkg4.semaan.pkg4.bj;
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner TECLADO = new Scanner(System.in);
        double NETFLIX, YUTU, DROP, SPOTIFY, RESULT, EDAD, RESULT1;
        System.out.println("Ingresa el costo de Netflix");
        NETFLIX = TECLADO.nextDouble();
        System.out.println("Ingresa el costo de Youtube Premium");
        YUTU = TECLADO.nextDouble();
        System.out.println("Ingresa el costo de Dropbox");
        DROP = TECLADO.nextDouble();
        System.out.println("Ingresa el costo de Spotify");
        SPOTIFY = TECLADO.nextDouble();
        System.out.println("Ingresa tu edad");
        EDAD = TECLADO.nextDouble();
        RESULT = NETFLIX + YUTU + DROP + SPOTIFY;
        if (EDAD < 30) {
            RESULT1 = (RESULT * 30 / 100);
            RESULT = RESULT - RESULT1;
            System.out.println("El valor total a pagar es" + " " + RESULT);
        } else {
            System.out.println("El valor total a pagar es" + " " + RESULT);
        }
    }
}
