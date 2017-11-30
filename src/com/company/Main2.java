package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);

        // Creamos una aplicación que al introducir  la hora el programa te de los buenos dias , buenas Tardes, Buenas noches o no has introducido una hora valida.

        System.out.println("introduzca la hora: ");

        int horaIntroducida = sc.nextInt();

        // Creamos las condiciones necesarias.


        // && Preguntamos si dos valores son verdaderos , si es así se cumple
        // || Preguntamos si una de las dos condiciones son verdaderas.
        // ! invierte el valor del de la condición.
        // Si la horaIntroducida es menor o igual que 6 True. Si la horaIntroducida Mayor que 12 es falso y continua

      /*  if (horaIntroducida >= 6 && horaIntroducida < 12 ){
            System.out.println("Son las "+horaIntroducida+" ,Buenos Dias!");

       // Si la horaIntroducida es Mayor o = 12 True. Si la horaIntroducida es mayor que 21 False y continua.

        }else if (horaIntroducida >= 12 && horaIntroducida < 21){
            System.out.println("Son las "+horaIntroducida+" ,Buenas Tardes!");

       // Si la horaIntroducida es mayor que 6 y la horaIntroducida

        }else if ((horaIntroducida < 6)|| (horaIntroducida >= 21 && horaIntroducida <=24)){
            System.out.println("Son las "+horaIntroducida+" ,Buenas Noches!");
        }else {
            System.out.println("No has introducido una hora valida...");
        }

        */

        switch (horaIntroducida) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Buenas Noches");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Buenos Dias");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Buenas Noches");
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            default:
                System.out.println("No has introducido una hora correcta");


        }
        }
    }



