package cuenta;
import cuentaJoven.CuentaJoven;
import cuentaJoven.CuentaJoven.*;
public class Cuenta extends CuentaJoven {

    private String titular;
    private double cantidad;

    CuentaJoven cuentaJoven = new CuentaJoven();

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

    public String mostrar() {
        return (titular +
                "\n" + cantidad);
    }

    public String ingresar(double cantidad1) {
        if (cantidad1 >= 0) {
            return "se va a ingresar " + cantidad1 +
                    "\ncantidad actual: " + (cantidad = cantidad + cantidad1);
        }
        return "cantidad actual: " + cantidad;
    }

    public String retirar(double cantidad2) {
        if (getEdad() >= 18 && getEdad() < 25) {
            return ("se va a retirar " + cantidad2 +
                    "\ncantidad actual: " + (cantidad = cantidad - cantidad2));
        }
        return "No se puede retirar";
    }
}
