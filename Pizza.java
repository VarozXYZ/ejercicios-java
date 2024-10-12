public class Pizza {
    
  //declaramos las variables necesarias de la clase
  
  private String size; //variable para el tamaño
  private String type; //variable para el tipo
  private Boolean served; //variable para saber el estado (false significa que está en preparación, true que está servida)
  private static Integer amountOrdered = 0; //variable que lleva la cuenta de las pizzas que se han pedido
  private static Integer amountServed = 0; //variable que lleva la cuenta de las pizzas que se han servido
  private String state; //variable que contiene el string que indica si está servida o en preparación
  
  public Pizza(String size, String type) { // declaramos el constructor
      this.size = size;   // toda pizza debe tener un tamaño
      this.type = type;   // toda pizza debe tener un tipo
      this.served = false;  // el estado de la pizza al ser creada es false (o en prepración) por default
      amountOrdered++;     // suma 1 al total de pizza pedidas
  }
  
  public void servePizza() {  //Creamos un metodo de la clase Pizza que pasa de en preparación a servida
      this.served = true;
      amountServed++;
  }
  
  public String saberEstado() { //creamos este método para poder pasar el dato boolean de served a unos datos legibles en String
      if (served) {
          state = "Servida";
      } else {
          state = "En preparación";
      } 
      return state;
  }
  
  public static void main(String[] args) {
      System.out.println("El primer pedido es de una pizza carbonara grande");
      Pizza pedido1 = new Pizza("grande", "carbonara");
      System.out.println("Datos del primer pedido:\nTamaño: " + pedido1.size + "\nTipo: " + pedido1.type + "\nEstado del pedido: " + pedido1.saberEstado() + 
      "\nNúmero de pizzas pedidas: " + amountOrdered + "\nNúmero de pizzas servidas: " + amountServed);
      System.out.println("El segundo pedido es de una pizza barbacoa pequeña");
      pedido1.servePizza();
      System.out.println("El primer pedido está listo para servir");
      Pizza pedido2 = new Pizza("pequeña", "barbacoa");
      System.out.println("Datos del segundo:\nTamaño: " + pedido2.size + "\nTipo: " + pedido2.type + "\nEstado del pedido: " + pedido2.saberEstado() + 
      "\nNúmero de pizzas pedidas: " + amountOrdered + "\nNúmero de pizzas servidas: " + amountServed);
  }
  
  
}
