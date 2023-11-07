/*
Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de
un número ingresado por el usuario; 
Solo en el caso que el valor del número esté entre 2 y 6.
 */
package taller.pkg4.semaan.pkg4.bj;
import java.util.Scanner;
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        double num1;
        System.out.println("Ingrese un numero");
        num = teclado.nextInt();
        if (num >= 2 && num <= 6) {
            num1 = num * 1;
            System.out.println(num + "x 1 = " + num1);
            num1 = num * 2;
            System.out.println(num + "x 2 = " + num1);
            num1 = num * 3;
            System.out.println(num + "x 3 = " + num1);
            num1 = num * 4;
            System.out.println(num + "x 4 = " + num1);
            num1 = num * 5;
            System.out.println(num + "x 5 = " + num1);
            num1 = num * 6;
            System.out.println(num + "x 6 = " + num1);
            num1 = num * 7;
            System.out.println(num + "x 7 = " + num1);
            num1 = num * 8;
            System.out.println(num + "x 8 = " + num1);
            num1 = num * 9;
            System.out.println(num + "x 9 = " + num1);
            num1 = num * 10;
            System.out.println(num + "x 10 = " + num1);
            num1 = num * 11;
            System.out.println(num + "x 11 = " + num1);
            num1 = num * 12;
            System.out.println(num + "x 12 = " + num1);
        } else {
            System.out.println("Numero inválido");
        }
    }
}
