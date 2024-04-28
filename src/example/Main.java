package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Menú
        menu();
    }

    public static void menu() {

        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        Double valor = 0.0, cantidad = 0.0;

        while (opcion != 7) {
            System.out.println("**********************************************************************************" + "\n");

            System.out.println("[ Conversor de Monedas Internacionales v1.0 by Anderson De La Rosa ]" + "\n");

            System.out.println("1) Dólar => Peso argentino" + "\n" +
                    "2) Peso argentino => Dólar" + "\n" +
                    "3) Dólar => Real brasileño" + "\n" +
                    "4) Real brasileño => Dólar" + "\n" +
                    "5) Dólar => Peso colombiano" + "\n" +
                    "6) Peso colombiano => Dólar" + "\n" +
                    "7) Salir" + "\n\n" +
                    "Ingrese una opción válida por favor: " + "\n");


            System.out.println("**********************************************************************************" + "\n");

            try {

                //Leer la opción ingresada por el usuario
                opcion = Integer.parseInt(teclado.nextLine());

                //Realizar la conversión según la opción ingresada


                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad de dólares a convertir a pesos argentinos: ");
                        cantidad = Double.parseDouble(teclado.nextLine());
                        valor = Conversor.dolarAPesoArgentino(cantidad);
                        System.out.println("El valor: " + cantidad + " [USD] corresponde al valor final de => " + valor + " [ARS]");
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de pesos argentinos a convertir a dólares: ");
                        cantidad = Double.parseDouble(teclado.nextLine());
                        valor = Conversor.pesoArgentinoADolar(cantidad);
                        System.out.println("El valor: " + cantidad + " [ARS] corresponde al valor final de => " + valor + " [USD]");
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad de dólares a convertir a reales brasileños: ");
                        cantidad = Double.parseDouble(teclado.nextLine());
                        valor = Conversor.dolarARealBrasileño(cantidad);
                        System.out.println("El valor: " + cantidad + " [USD] corresponde al valor final de => " + valor + " [BRL]");
                        break;
                    case 4:
                        System.out.print("Ingrese la cantidad de reales brasileños a convertir a dólares: ");
                        cantidad = Double.parseDouble(teclado.nextLine());
                        valor = Conversor.realBrasileñoADolar(cantidad);
                        System.out.println("El valor: " + cantidad + " [BRL] corresponde al valor final de => " + valor + " [USD]");
                        break;
                    case 5:
                        System.out.println("Ingrese la cantidad de dólares a convertir a pesos colombianos: ");
                        cantidad = Double.parseDouble(teclado.nextLine());
                        valor = Conversor.dolarAPesoColombiano(cantidad);
                        System.out.println("El valor: " + cantidad + " [USD] corresponde al valor final de => " + valor + " [COP]");
                        break;
                    case 6:
                        System.out.println("Ingrese la cantidad de pesos colombianos a convertir a dólares: ");
                        cantidad = Double.parseDouble(teclado.nextLine());
                        valor = Conversor.pesoColombianoADolar(cantidad);
                        System.out.println("El valor: " + cantidad + " [COP] corresponde al valor final de => " + valor + " [USD]");
                        break;
                    case 7:
                        System.out.println("Gracias por utilizar el conversor de monedas internacionales.");
                        break;
                    default:
                        System.out.println("Por favor, ingrese una opción válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Por favor, ingrese una opción válida.");
                opcion = 0; //Establecemos un valor default para la opción en caso de error.
            }
        }
    }
}