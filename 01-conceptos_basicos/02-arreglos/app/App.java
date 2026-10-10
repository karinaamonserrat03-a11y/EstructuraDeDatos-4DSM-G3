import mx.edu.uttt.arreglos.ArreglosMenu;
import mx.edu.uttt.menu.Menu;
import mx.edu.uttt.recursividad.Recursividad;
import mx.edu.uttt.recursividad.RecursividadMenu;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        iniciar();
    }
    public static void iniciar(){
        String opcion;
        do {
            opcion = Menu.menuPrincipal();
            switch (opcion){
                case "1":
                    ArreglosMenu.mostrar();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Listas");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Pilas");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Colas");
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Árboles");
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Programa Terminado");
                    return;
                case "6":
                    RecursividadMenu.mostrar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }while (true);
    }
}
