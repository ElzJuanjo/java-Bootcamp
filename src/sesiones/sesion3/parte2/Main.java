package sesiones.sesion3.parte2;

public class Main {

    // Función Flecha
    static Runnable funcionFlecha(int contador){
        return () -> {
            for(int i=0; i< contador; i++){
                System.out.println("Posición: "+i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error: "+e);
                }
            }
        };
    }
    public static void main(String[] args) {
        Runnable imprimirFuncion = funcionFlecha(10);
        new Thread(imprimirFuncion).start();
    }
}
