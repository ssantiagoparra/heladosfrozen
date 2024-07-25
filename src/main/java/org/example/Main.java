package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Precios de los helados
        double precioHeladoSimple = 2500;
        double precioHeladoDoble = 4000;
        double precioHeladoEspecial= 5300;

        Scanner leerTeclado = new Scanner(System.in);

        //El usuario ingresa la cantidad de cada helado vendido
        System.out.print("Ingrese la cantidad vendida de helados simples: ");
        int cantidadSimple = leerTeclado.nextInt();

        System.out.print("Ingrese la cantidad vendida de helados dobles: ");
        int cantidadDobles = leerTeclado.nextInt();

        System.out.print("Ingrese la cantidad vendida de helados especiales: ");
        int cantidadEspeciales = leerTeclado.nextInt();

        //Total de ventas para cada tipo de helados
        double totalVentaSimples = cantidadSimple * precioHeladoSimple;
        double totalVentasDobles = cantidadDobles * precioHeladoDoble;
        double totalVentasEspeciales = cantidadEspeciales * precioHeladoEspecial;

        //Calculo
        double totalGeneralVentas = totalVentaSimples + totalVentasDobles + totalVentasEspeciales;

        //Resultados
        System.out.println("**************************************");
        System.out.println("Total de ventas Helado Simple: $" + totalVentaSimples);
        System.out.println("Total de ventas Helados Dobles: $" + totalVentasDobles);
        System.out.println("Total de ventas Helados Especiales: $" + totalVentasEspeciales);
        System.out.println("**************************************");
        System.out.println("Total general de ventas del día: $" + totalGeneralVentas);


    }
}