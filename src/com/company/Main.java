package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        int numero = 100;
        int moduloDivision = numero % 2;
        if (moduloDivision == 0){



            System.out.println("El numero " +numero+ " es par");



        } else {
            System.out.println(" El numero " +numero+ " Es impar");

        }
 */

        int numeroIntroducido = 0;
        int moduloDivision = numeroIntroducido % 2;
        if (moduloDivision == 0) {
            System.out.println("El numero "+numeroIntroducido+" es par");
            numeroIntroducido=sc.nextInt();

        }else {
            System.out.println("El numero "+numeroIntroducido+ " es impar");
        }

        System.out.print("Introduce un numero: ");





    }
}
