// Nombre de la clase
class Main{

  // Atributos
  // TIpos de datos enteros
  int i; // 32 bits
  short sh; // 16 bits
  long l; // 64 bits 

  // Tipos de datos de punto flotante
  // IEEE 735
  float f; 
  double d;

  // Tipos de datos 
  boolean bool; // True - False
  byte b; // 8 bits

  // Tipos de datos caracteres
  char c = 'a'; // 8 bits
  String s = "HOla"; // n - bits

  // Tipo de dato complejo
  Main main;
  int[] enteros; // Vector
  float [][] flotante; // Matrices Arrays 

  // Metodos
  // 1 Modo de acceso (public, protected, private)
  // 2 Tipo de retorno
  // 3 Nombre del metodo
  public void ladrarMucho(int i, Main m) {
    // Escribir en consola
    System.out.println("Guaf!!");
  }

  protected Main ladrarPoco() {
    return null;
  }

  public static void main(String[] args) {
    System.out.println("Hola Mundo!!!");
  }
}