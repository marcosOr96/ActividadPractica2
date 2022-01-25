public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String mostrar(){
        return titular+
                "\n"+cantidad;
    }

    public String ingresar(double cantidad1){
        if (cantidad1 >= 0) {
            return "se va a ingresar "+cantidad1+
                    "\ncantidad actual: "+(cantidad=cantidad+cantidad1);
        }
        return "cantidad actual: "+cantidad;
    }

    public String retirar(double cantidad2){
        return "se va a retirar "+ cantidad2+
                "\ncantidad actual: "+(cantidad=cantidad-cantidad2);
    }
}
