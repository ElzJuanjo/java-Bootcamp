package sesiones.sesion5;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.conectar(10);
        list.conectar(20);
        list.conectar(30);
        list.conectar("Hola");
        list.conectar("Mundo");
        list.imprimir();
    }
}
