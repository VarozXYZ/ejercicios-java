public class Dados {
  
  public static void main(String[] args) {
    int tiradaTotal = 0;

    for (int i = 1; i < 7; i++) {
        int tiradaActual = (int) (Math.random()*6+1);
        System.out.println("El resultado de la tirada número " + i + " es: " + tiradaActual);
        tiradaTotal += tiradaActual;
    } 
    System.out.println("La suma de todas las tiradas es: " + tiradaTotal);
}
}
