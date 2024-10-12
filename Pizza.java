public class Pizza {
    
  private String size; 
  private String type; 
  private Boolean served; 
  private static Integer amountOrdered = 0; 
  private static Integer amountServed = 0; 
  private String state; 
  
  public Pizza(String size, String type) { 
      this.size = size;   
      this.type = type;   
      this.served = false;  
      amountOrdered++;
      System.out.println(this + "\nTamaño: " + this.size + "\nTipo: " + this.type + "\nEstado del pedido: " + this.saberEstado() + 
      "\nNúmero de pizzas pedidas: " + amountOrdered + "\nNúmero de pizzas servidas: " + amountServed);
  }
  
  public void servePizza() {  
      this.served = true;
      amountServed++;
  }
  
  public String saberEstado() { 
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
      System.out.println("El segundo pedido es de una pizza barbacoa pequeña");
      pedido1.servePizza();
      System.out.println("El primer pedido está listo para servir");
      Pizza pedido2 = new Pizza("pequeña", "barbacoa");
  }
  
  
}
