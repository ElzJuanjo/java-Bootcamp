package sesiones.sesion3.parte3;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola MUndo", "Ventana", 1);
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    }
}
