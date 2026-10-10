package mx.edu.uttt.menu;

import javax.swing.*;

public class Menu {
    public static String menuPrincipal(){
        String opciones= "=============  ESTRUCTURA DE DATOS =============\n\n" +
                         "1) Arreglos\n" +
                         "2) Listas\n" +
                         "3) Pilas\n" +
                         "4) Colas\n" +
                         "5) Árboles\n" +
                         "6) Recursividad\n" +
                         "0) Salir\n" +
                         "Seleccione una opción: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuArreglos(){
        String opciones= "=============  ARREGLOS  =============\n\n" +
                        "1) Vectores\n" +
                        "2) Matrices\n" +
                        "0) Regresar\n" +
                        "Seleccione una opción: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuVectores(){
        String opciones = "=============  VECTORES  =============\n\n" +
                "1) Agregar Valor al Vector\n" +
                "2) Llenar el " +
                "\n" +
                "3) Sumar los datos del vector\n" +
                "4) Sumar los datos del vect" +
                "or de instancia con otro vector\n" +
                "5) Promedio de los valores del Vector\n" +
                "6) Valor Mayor\n" +
                "7) Valor Menor\n" +
                "8) Calcular los pares y guardarlos en un vector\n" +
                "9) Calcular los primos y guardarlos en un vector\n" +
                "10) Buscar un elemento (muestra dato y posición)\n" +
                "11) Imprimir\n" +
                "0) Regresar\n\n" +
                "Seleccione una opción: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuMatrices(){
        String opciones= "=============  MATRICES  =============\n\n" +
                "1) Reserva de Asientos \n" +
                "2) Acomulado de Ventas\n" +
                "3) Matriz de identidad\n" +
                "4) Diagonal Principal\n" +
                "5) Transposición\n" +
                "6) Rotación\n" +
                "7) Llenar Matriz\n" +
                "8) Imprimir\n" +
                "0) Regresar\n" +
                "Seleccione una opción: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuRecursividad(){
        String opciones= "=============  RECURSIVIDAD  =============\n\n" +
                "1) Sumar numero de 1 a N \n" +
                "2) Factorial\n" +
                "3) Multiplicación \n" +
                "4) Potencia\n" +
                "0) Regresar\n" +
                "Seleccione una opción: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuListas(){

        return"";
    }

    public static String menuColas(){
        return"";
    }

    public static String menuPilas(){
        return"";
    }

    public static String menuArboles(){
        return"";
    }



}
