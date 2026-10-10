package mx.edu.uttt.arreglos.vectores;

import javax.swing.*;

//ejercicios
public class Vectores {
    private int[] vector;
    private int tamanio;

    public Vectores(){
        vector = new int[2];
        this.tamanio = vector.length;
    }
    public Vectores(int tamanio){
        this.vector = validartamanio(tamanio) ? new int[tamanio] : new int[2];
        this.tamanio = this.vector.length;
    }
     private boolean validartamanio(int tamanio){
        return tamanio > 0;
     }

     private boolean sonIguales (int[] vector){
        return  this.vector.length == vector.length;
     }

     public  void llenarVector(int [] vector){
        if(sonIguales(vector)){
            for (int i = 0; i <this.vector.length ; i++) {
                this.vector[i] = vector[i];
            }
        }else {
            System.out.println("Los vectores no son del mismo tamaño");
        }
     }

     public int sumarValores(){
        int suma = 0;
         for (int i = 0; i < this.vector.length; i++) {
             suma+=this.vector[i];
         }
         return suma;
     }

     public int obtenertamanio(){
        return this.tamanio;
     }

     public String imprimir(){
        String salida = "";
        for (int valor:this.vector){
            salida+= valor + " ";
        }
        return salida;
     }

    public void agregar(int a) {
        int[] nuevo = new int[vector.length + 1];
        for (int i = 0; i < vector.length; i++) {
            nuevo[i] = vector[i];
        }
        nuevo[vector.length] = a;
        this.vector = nuevo;
    }
    public String sumaVector(int[] vector2) {
        if(this.vector.length != vector2.length){
            return "El tamaño no es el mismo";
        }
        String vector3 = "";
        for (int i = 0; i < vector.length; i++) {
            vector3 += (vector[i] + vector2[i]) + " ";
        }
        return vector3;
    }
    // Promedio
    public double numPromedio() {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return (double) suma / vector.length;
    }
    // Valor mayor
    public int Mayor() {
        int num = 0;
        for (int i = 0; i < vector.length; i++) {
            if (num < vector[i] ) {
                num = vector[i];
            }
        }
        return num;
    }

    // Valor menor
    public int Menor() {
        int num = 0;
        for (int i = 0; i < vector.length; i++) {
            if (num> vector[i]){
                num = vector[i];
            }
        }
        return num;
    }
    public int[] obtenerPares() {
        int contador = 0;
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] % 2 == 0) {
                contador++;
            }
        }

        int[] vectorPares = new int[contador];
        int idx = 0;
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] % 2 == 0) {
                vectorPares[idx] = this.vector[i];
                idx++;
            }
        }
        return vectorPares;
    }

    public int[] obtenerPrimos() {
        int contador = 0;
        for (int i = 0; i < this.vector.length; i++) {
            if (esPrimo(this.vector[i])) {
                contador++;
            }
        }

        int[] vectorPrimos = new int[contador];
        int idx = 0;
        for (int i = 0; i < this.vector.length; i++) {
            if (esPrimo(this.vector[i])) {
                vectorPrimos[idx] = this.vector[i];
                idx++;
            }
        }
        return vectorPrimos;
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public String buscar(int v) {
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] == v) {
                return "Numero: " + v + " ->  Posición: " + i;
            }
        }
        return "El dato " + v + " no se encuentra en el vector.";
    }
}
