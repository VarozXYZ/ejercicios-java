public class CuentaBanco {
    
  private Float saldoCuenta;
  private Float cantidad;
  private String concepto;
  private Integer idMovimiento;
  
  public CuentaBanco(Float saldoCuenta) {
      this.saldoCuenta = saldoCuenta;
  }
  
  public void MovimientosMes(Float nomina, Float facturaTelefonica, Float facturaLuz) {
      this.saldoCuenta += nomina;
      this.saldoCuenta -= facturaTelefonica;
      this.saldoCuenta -= facturaLuz;
      System.out.println("Nuevo saldo: " + this.saldoCuenta);
  }
  
  
  public static void main(String[] args) {
      CuentaBanco micuenta = new CuentaBanco(1500f);
      
      micuenta.MovimientosMes(1200f, 80f, 150f);
  }
}