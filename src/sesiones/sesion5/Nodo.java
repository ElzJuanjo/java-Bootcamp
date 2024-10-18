package sesiones.sesion5;

public class Nodo {

    private Object info;
    private Nodo next;

    public Nodo(Object info) {
        this.info = info;
        this.next = null;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Object getInfo() {
        return info;
    }

    public Nodo getNext() {
        return next;
    }
}
