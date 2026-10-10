public class ArreglosMenu {

    private static Vectores objVector;
    private static Matrices objMatriz;

    private static void inicializar(){
        int tamanio = 0;
         do {
             try{
                 tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo"));
                 objVector = new Vectores(tamanio);
                 return;
             }catch (NumberFormatException ex){
                 JOptionPane.showMessageDialog(null, "La tamaño debe ser un número");
             }
         }while (true);
    }

    private static void inicializarMatrices(){
        int filas = 0, columnas = 0;
        do {
            try {
                filas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de FILAS:"));
                columnas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de COLUMNAS:"));
                if (filas > 0 && columnas > 0) {
                    objMatriz = new Matrices(filas, columnas);
                    return;
                }
                JOptionPane.showMessageDialog(null, "Los valores deben ser mayores a cero.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Las dimensiones deben ser números enteros.");
            }
        } while (true);
    }


    public static void mostrar() {
        String opcion;
        do {
            opcion = Menu.menuArreglos();
            switch (opcion){
                case "1":
                    menuVectores();
                    break;
                case "2":
                    menuMatrices();
                    break;
                case "0":
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }while (true);
    }

    public static int [] obtenerVector(){
        int tamanio = objVector.obtenertamanio();
        int vector [] = new int[tamanio];
        llenarVector(vector);
        return vector;
    }

    public static int[][] obtenerMatriz(){
        String[] tam = objMatriz.obtenerTamano().replace("Tamaño: (", "").replace(")", "").split(",");
        int f = Integer.parseInt(tam[0]);
        int c = Integer.parseInt(tam[1]);
        int[][] mAux = new int[f][c];
        llenarMatriz(mAux);
        return mAux;
    }
    private static void llenarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                do {
                    try {
                        m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matriz[" + i + "][" + j + "]:"));
                        break;
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un número entero");
                    }
                } while (true);
            }
        }
    }

    private  static void llenarVector (int[] vector){
        int valor = 0;
        for (int i = 0; i < vector.length ; i++) {
            do {
                try{
                    valor = Integer.parseInt(JOptionPane.showInputDialog(
                            "Introduce el valor " + (i + 1)));
                    vector[i] = valor;
                    break;
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "La tamaño debe ser un número");
                }
            }while (true);
        }

    }

    public static void menuVectores(){
        String opcion;
        inicializar();
        do {
            opcion = Menu.menuVectores();
            switch (opcion){
                case "1": // Agregar
                    int valorAgregar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor a agregar:"));
                    objVector.agregar(valorAgregar);
                    JOptionPane.showMessageDialog(null, "Valor agregado correctamente");
                    break;

                case "2": // Llenar
                    objVector.llenarVector(obtenerVector());
                    JOptionPane.showMessageDialog(null, "Vector llenado correctamente");
                    break;
                case "3": // Sumar
                    JOptionPane.showMessageDialog(null, "Suma: " + objVector.sumarValores());
                    break;
                case "4": // Sumar con otro vector
                    JOptionPane.showMessageDialog(null, objVector.sumaVector(obtenerVector()));
                    break;
                case "5": // Promedio
                    JOptionPane.showMessageDialog(null, "Promedio: " + objVector.numPromedio());
                    break;
                case "6": // Mayor
                    JOptionPane.showMessageDialog(null, "Mayor: " + objVector.Mayor());
                    break;
                case "7": // Menor
                    JOptionPane.showMessageDialog(null, "Menor: " + objVector.Menor());
                    break;
                case "8": // Pares
                    int[] vectorPares = objVector.obtenerPares();
                    String auxPares = "Pares: ";
                    for (int v : vectorPares) {
                        auxPares += v + " ";
                    }
                    JOptionPane.showMessageDialog(null, auxPares);
                    break;
                case "9": // Primos
                    int[] vectorPrimos = objVector.obtenerPrimos();
                    String auxPrimos = "Primos: ";
                    for (int v : vectorPrimos) {
                        auxPrimos += v + " ";
                    }
                    JOptionPane.showMessageDialog(null, auxPrimos);
                    break;
                case "10": // Buscar
                    int datoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número a buscar:"));
                    JOptionPane.showMessageDialog(null, objVector.buscar(datoBuscar));
                    break;
                case "11": // Imprimir
                    JOptionPane.showMessageDialog(null, "Vector: " + objVector.imprimir());
                    break;
                case "0":
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }while (true);
    }

    public static void menuMatrices(){
        String opcion;
        inicializarMatrices();
        do {
            opcion = Menu.menuMatrices();
            switch (opcion){
                case "1":
                    objMatriz.solicitarYReservarAsiento();
                    break;
                case "2": // Asientos
                    objMatriz.totalMes();
                    break;
                case "3":
                    objMatriz.matrizIdentidad();
                    break;
                case "4":
                    objMatriz.matrizIdentidad();
                    break;
                case "5":
                    objMatriz.obtenerTranspuesta();
                    break;
                case "6":
                    objMatriz.rotacionMatriz();
                    break;
                case "7":
                    objMatriz.llenar(obtenerMatriz());
                    break;
                case "8":
                    objMatriz.imprimir();
                    break;
                case "0":
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        }while(true);
    }
}
