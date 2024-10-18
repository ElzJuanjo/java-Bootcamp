package sesiones.sesion5;

public class LinkedList {

    private Nodo head = null;

    public void conectar(Object info) {
        Nodo newNodo = new Nodo(info);
        if (head == null) {
            head = newNodo;
        } else {
            Nodo pointer = head;
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(newNodo);
        }
    }

    public void imprimir() {
        if (head != null) {
            Nodo pointer = head;
            while (pointer != null) {
                System.out.print(pointer.getInfo() + " -> ");
                pointer = pointer.getNext();
            }
            System.out.print("NULL");
        }
    }

}
