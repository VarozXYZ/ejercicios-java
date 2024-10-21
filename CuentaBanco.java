public class CuentaBanco {
    
    private Float saldoCuenta;
    private Float cantidad;
    private String concepto;
    private Integer idMovimiento = 0;
    
    public CuentaBanco(Float saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    
    public void MovimientosMes(Float nomina, Float facturaTelefonica, Float facturaLuz) {
        this.saldoCuenta += nomina;
        this.saldoCuenta -= facturaTelefonica;
        this.saldoCuenta -= facturaLuz;
        this.idMovimiento++;
        System.out.println("Nuevo saldo: " + this.saldoCuenta);
    }
    
    
    public static void main(String[] args) {
        CuentaBanco micuenta = new CuentaBanco(0f);
        
        micuenta.MovimientosMes(1200f, 80f, 150f);
        
        System.out.println(micuenta.saldoCuenta);
    }
  }