public class Bombilla {
  public static final int MAX_POT = 10;
  private boolean encendida;
  private int potencia;
  private String marca;

  public Bombilla(String m, int p) {
      this.marca = m;
      this.potencia = p;
      this.encendida = false; 
  }

  public void encender(int p) {
      encendida = true;
      if (p > MAX_POT) {
          potencia = MAX_POT;
          System.out.println("La potencia no puede superar 10. Potencia fijada a 10.");
      } else {
          potencia = p;
      }
  }

  public int getPotencia() {
      return potencia;
  }

  public void setPotencia(int potencia) {
      this.potencia = potencia;
  }

  public void apagar() {
      encendida = false;
      potencia = 0;
  }

  public void aumentarPotencia(int i) {
      int potenciaFinal = potencia + i;
      if (potenciaFinal > MAX_POT) {
          potenciaFinal = MAX_POT;
          System.out.println("La potencia no puede superar 10.");
      }

      while (potencia < potenciaFinal) {
          potencia++;
          System.out.println("Potencia aumentada a " + potencia);
      }
  }

  public void aumentarPotenciaExacta(int pot) {
      if (potencia + pot > MAX_POT) {
          potencia = MAX_POT;
          System.out.println("Potencia fijada al máximo: " + MAX_POT);
      } else {
          potencia += pot;
      }
      imprimir();
  }

  public void imprimir() {
      System.out.println("Estado de la bombilla:\nMarca: " + marca + "\nEncendida: " + encendida + "\nPotencia: " + potencia);
  }

  public static void main(String[] args) {
      Bombilla b1 = new Bombilla("Philips", 5);
      b1.aumentarPotencia(12); 
      b1.imprimir(); 
  }
}
