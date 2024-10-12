public class Smartphone {
    
  private String marca;
  private Float precio;
  private String modelo;
  private Float pulgadas;
  
  public Smartphone(String marca, Float precio, String modelo, Float pulgadas) {
      this.marca = marca;
      this.precio = precio;
      this.modelo = modelo;
      this.pulgadas = pulgadas;
      System.out.print("Nuevo teléfono creado!\nMarca: " + this.marca + "\nPrecio: " + this.precio + "€" + "\n Modelo: " + this.modelo + "\nTamaño de pantalla: " + this.pulgadas);
  }
  
  
  public static void main(String[] args) {
      Smartphone phone1 = new Smartphone("LG", 399.99f, "Q60", 6.5f);
  }
}