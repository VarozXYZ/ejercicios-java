public class Libro {
    
  String isbn;
  String titulo;
  Integer year;
  Boolean prestado = false;

  public Libro(String isbn, String titulo, Integer year) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.year = year;
    }

  public void prestar() {
    this.prestado = true;
  }

  public void devolver() {
    this.prestado = false;
  }

  public void estado() {
    if (prestado) {
        System.out.println("Libro prestado");
    } else {
        System.out.println("Libro no prestado");
    }
  }

  public static void main(String[] args) {
    Libro libro1 = new Libro("9788408297079", "Alas de Onix", 2025);
    libro1.estado();
    libro1.prestar();
    libro1.estado();
  }
}