package sesiones.sesion4.parte2;

public class Persona {

    // Atributos
    protected int edad;
    private String nombre;
    public double estatura;

    // Constructor Vacio
    public Persona() {
    }

    // Constructor con parámetros
    public Persona(int edad, String nombre, double estatura) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos
    public void Saludar() {
        System.out.println(this.nombre + " dice: Hola Mundo");
    }

}
