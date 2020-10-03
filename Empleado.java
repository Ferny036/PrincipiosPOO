// Encapsulamiento
class Empleado {

  private int numEmpleado;
  private String nombre;
  private String correo;
  private String telefono;
  private boolean genero; // True H - False M

  // Constructor
  // 1 Modo de Acceso (public, protected)
  // 2 Nombre de la clase
  // 3 Argumentos
  public Empleado() {
    this.numEmpleado = 0;
    this.nombre = "Fernando";
    this.correo = "example@mail.com";
  }

  // Getters y Setters

  // Getter
  public String obtenerNombre() {
    return this.nombre;
  }

  // Setter
  public void asignarNombre(String nombre) {
    this.nombre = nombre;
  }

  public static void main(String[] args) {
    Empleado empleado = new Empleado();
    System.out.println(empleado.obtenerNombre());
    empleado.asignarNombre("Roger");
    System.out.println(empleado.obtenerNombre());
  }
}