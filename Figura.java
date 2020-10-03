//Polimorfismo y Herencia
abstract class Figura {

  String nombre;

  public abstract double obtenerArea();

  public abstract double obtenerPerimetro();

  public String getNombre() {
    return this.nombre;
  }

  public static void main(String[] args) {
    Figura[] figuras = { new Rectangulo(3, 3), new Triangulo(3, 3), new Circulo(5) };

    // Aplicacion de Polimorfismo
    for (Figura figura : figuras) {
      System.out.println("\n" + figura.getNombre() + " => \nArea:" + String.valueOf(figura.obtenerArea())
          + "\tPerimetro:" + String.valueOf(figura.obtenerPerimetro()));
    }
  }
}

// Extends indica que se esta aplicando Herencia
class Triangulo extends Figura {

  double base;
  double altura;

  public Triangulo(double base, double altura) {
    super();
    this.base = base;
    this.altura = altura;
    this.nombre = "Triangulo";
  }

  public double obtenerArea() {
    return base * altura / 2;
  }

  public double obtenerPerimetro() {
    return 3 * base;
  }
}

class Rectangulo extends Figura {
  double base;
  double altura;

  public Rectangulo(double base, double altura) {
    super();
    this.base = base;
    this.altura = altura;
    this.nombre = "Rectangulo";
  }

  public double obtenerArea() {
    return this.base * this.altura;
  }

  public double obtenerPerimetro() {
    return 2 * this.base + 2 * this.altura;
  }

}

class Circulo extends Figura {

  double radio;

  public Circulo(double radio) {
    super();
    this.radio = radio;
    this.nombre = "Circulo";
  }

  public double obtenerArea() {
    return 3.141592 * (this.radio * this.radio);
  }

  public double obtenerPerimetro() {
    return 3.141592 * 2 * this.radio;
  }
}