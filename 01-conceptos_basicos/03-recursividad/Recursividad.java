package mx.edu.uttt.recursividad;

public class Recursividad {
    public static void saludar1(int n) {
        // caso base
        if (n == 1) {
            System.out.println("Hola saludar " + n);
        } else {
            // caso general
            saludar1(n - 1);
            System.out.println("Hola saludar " + n);
        }
    }

    public  static void saludar2(int n) {
        if (n != 1) {
            //caso general
            System.out.println("Hola saludar " + n);
            saludar2(n - 1);

        } else {
            System.out.println("Hola saludar " + n);
        }
    }

    public static void saludar3(int n) {

        if (n == 0) {
            return;
        }
        System.out.println("Hola saludar " + n);
        saludar3(n - 1);
    }

    // sumar numero
    public static int suma(int n){
        if (n==1){
            return 1;
        }
        return n + suma(n-1);
    }

    // factorial de un numero
    public static int factorial(int n){
        if (n==1){
            return 1;
        } else{
            return n * factorial(n-1);
        }

    }

    // multiplicación mediante suma
    public static int multiplicacion(int x, int y){
        if (y==0){
            return 0;
        }
        return x + multiplicacion(x,y-1);
    }

    // potencia mediante multipliación
    public static int potencia(int base, int exponente){
        if (exponente==0) {
            return 1;
        }
        return base * potencia(base, exponente-1);
    }



}
