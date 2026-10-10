package mx.edu.uttt.matrices;

import javax.swing.*;

public class Matrices {
    //variable de instancia : caracteristica del objeto
    private int [][] m;

    public Matrices(){
        m = new int[2][2];
    }

    public Matrices(int fila, int columna){
        if(fila>0 && columna>0){
            this.m = new int[fila][columna];
        }else {
            this.m = new int[2][2];
        }

    }

    private boolean validar(int fila, int columna) {
        boolean valido = true;
        if (fila < 0 || fila >= this.m.length || columna < 0 || columna >= this.m[0].length) {
            JOptionPane.showMessageDialog(null,
                    "Está fuera del rango la matriz.");
            valido = false;
        }
        return valido;
    }

    private boolean validartamanos(int[][] m){
        return this.m.length == m.length && this.m[0].length == m[0].length;
    }

    public void llenar(int [][] m){
        if (validartamanos(m)) {
            for (int i = 0; i <this.m.length; i++) {
                for (int j = 0; j < this.m[i].length; j++) {
                    this.m[i][j] = m[i][j];
                }
            }
        }else {
            System.out.println("Las matrices no son del mismo Tamaño");
        }

    }

    public void imprimir(){
        for (int fila[]: this.m){
            for (int valor: fila){
                System.out.println(valor + "|");
            }
            System.out.println();
        }
    }

    public String obtenerTamano(){
        return "Tamaño: (" + this.m.length + "," + this.m[0].length + ")";
    }

    private boolean validarCuadrada(){
        /*En una matriz (bidimencional)
        * m.length -> Numero de filas
        * m[0].length -> Número de columnas
        * */
        return m.length == m[0].length;
    }

    public Matrices obtenerTranspuesta(){
        Matrices objMatriz = null;
        if(validarCuadrada()){
            int [][] transpuesta = new int[this.m.length][this.m.length];
            objMatriz = new Matrices (this.m.length,this.m.length);
            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    transpuesta[j][i] = this.m[i][j];
                }
            }
            objMatriz.llenar(transpuesta);
        }else {
            System.out.println("Advertencia: la matriz no es cuadrada");
        }
        return objMatriz;
    }


    public void solicitarYReservarAsiento() {
        try {
            int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce la fila del asiento a reservar:"));
            int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce la columna del asiento a reservar:"));

            this.reservaAsiento(fila, columna);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar números válidos.");
        }
    }


    public void reservaAsiento(int fila, int columna) {
        if (validar(fila, columna)) {
            if (this.m[fila][columna] == 1) {
                JOptionPane.showMessageDialog(null,
                        "El asiento ya está OCUPADO. Elige otro.");
            }
            else {
                this.m[fila][columna] = 0;
                JOptionPane.showMessageDialog(null,
                        "Lugar libre. Se ha reservado el asiento.");
                this.m[fila][columna] = 1;
            }
            String mapa = "=== MAPA DE ASIENTOS ===\n(0 = Libre | 1 = Ocupado)\n\n";
            for (int f = 0; f < this.m.length; f++) {
                for (int c = 0; c < this.m[f].length; c++) {
                    int estado = (this.m[f][c] == 1) ? 1 : 0;
                    mapa += "| " + estado + " ";
                }
                mapa += "|\n";
            }
            JOptionPane.showMessageDialog(null, mapa);
        }
    }

    public String totalSucursal() {
        String reporteSuc= "--- VENTA TOTAL POR SUCURSAL ---\n";
        for (int f = 0; f < this.m.length; f++) {
            int sumaFila = 0;
            for (int c = 0; c < this.m[f].length; c++) {
                sumaFila += this.m[f][c];
            }
            reporteSuc += "Sucursal " + (f + 1) + ": $" + sumaFila + "\n";
        }
        return reporteSuc;
    }

    public void totalMes() {
        String reporte = "=== REPORTE ACUMULADO DE VENTAS ===\n\n" + totalSucursal();

        reporte += "\n--- VENTA TOTAL POR MES ---\n";
        for (int c = 0; c < this.m[0].length; c++) {
            int sumaColum = 0;

            for (int f = 0; f < this.m.length; f++) {
                sumaColum += this.m[f][c];
            }
            reporte += "Mes " + (c + 1) + ": $" + sumaColum + "\n";
        }
        JOptionPane.showMessageDialog(null, reporte);
    }

    public void matrizIdentidad(){
        if (validarCuadrada()){
            int suma = 0;
            boolean identidad = true;
            for (int f = 0; f < this.m.length; f++) {
                for (int c = 0; c < this.m[f].length; c++) {

                    if (f == c) {
                        if (this.m[f][c] != 1) {
                            identidad = false;
                        }
                        suma += this.m[f][c];
                    }
                    else {
                        if (this.m[f][c] != 0) {
                            identidad = false;
                        }
                    }

                }
            }

            if (identidad) {
                JOptionPane.showMessageDialog(null, "Matriz de Identidad\nSuma de la diagonal principal: " + suma);
            } else {
                JOptionPane.showMessageDialog(null, "NO es una Matriz de Identidad");
            }

        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es cuadrada. Operación cancelada.");
        }
    }

    public Matrices rotacionMatriz(){
        Matrices objMatriz = null;

        if (validarCuadrada()) {
            int n = this.m.length;
            int[][] rotada = new int[n][n];
            objMatriz = new Matrices(n, n);

            int nuevaColumna = 0;

            for (int f = n - 1; f >= 0; f--) {
                for (int c = 0; c < n; c++) {
                    rotada[c][nuevaColumna] = this.m[f][c];
                }
                nuevaColumna++;
            }

            objMatriz.llenar(rotada);
        } else {
            JOptionPane.showMessageDialog(null, "Advertencia: la matriz no es cuadrada");
        }

        return objMatriz;
    }

}
