package mx.edu.uttt.recursividad;

public class VectoresRecursivos {
    public static void main(String[] args) {
        int [] vector = {10,20,30,40,50};
        //metodo iterativo de izquierda a derecha; 
        imprimirCiclico1(vector);
        imprimirCiclico2(vector);
        imprimirRecursivo1(2, vector);
    }
    
    public static void imprimirCiclico1(int [] v){
        for (int i = 0; i <v.length ; i++) {
            System.out.println(v[i] + "|");
        }
        
    }
    public static void imprimirCiclico2(int [] v){
        for (int i = v.length-1; i >=0 ; i--) {
            System.out.println(v[i] + "|");
        }
    }
    public static void imprimirRecursivo1(int posicion, int[] vector) {
        //cao base
        if(posicion ==vector.length){
            return;
        }
        System.out.println(vector[posicion] + "|");
        //caso general
        imprimirRecursivo1(posicion-1, vector);
    }
}
