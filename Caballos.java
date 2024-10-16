public class Caballos {
  
    private String nombre;
    private String color;
    private Integer edad;
    private Integer carrerasGanadas = 0;
    private Integer carrerasPerdidas = 0;
    private Integer trofeos= 0;
        
        
    public Caballos(String nombre, String color, Integer edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }
    
    public int getCarrerasGanadas() {
        return carrerasGanadas;
    }
    
    public void setCarrerasGanadas(Integer newCarrerasGanadas){
        this.carrerasGanadas = newCarrerasGanadas;
    }
    
    public int getCarrerasPerdidas() {
        return carrerasPerdidas;
    }
        
    public void setCarrerasPerdidas(Integer newCarrerasPerdidas) {
        this.carrerasPerdidas = newCarrerasPerdidas;
    }
    
    public int getTrofeos() {
        return trofeos;
    }
    
    public void setTrofeos(Integer newTrofeos) {
        this.trofeos = newTrofeos;
    }
    
    public void verDatosCaballo() {
        System.out.println("El caballo se llama " + this.nombre + ", es de color " + this.color + " y tiene " + this.edad + ". Ha ganado " + this.carrerasGanadas + " y ha perdido " + this.carrerasPerdidas + ". Además tiene " + this.trofeos + " trofeos.");
    }

    
    public static void main(String[] args) {
        Caballos caballo1 = new Caballos("Gavilan", "blanco", 5);
        caballo1.setCarrerasGanadas(4);
        caballo1.setCarrerasPerdidas(0);
        caballo1.setTrofeos(2);
        caballo1.verDatosCaballo();
    }
    
    
}