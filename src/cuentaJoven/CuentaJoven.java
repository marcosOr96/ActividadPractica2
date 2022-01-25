package cuentaJoven;

public class CuentaJoven {

    private double bonificacion;
    private int edad;

    public CuentaJoven() {
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esTitularValido(){
        if (edad >= 18 && edad < 25){
            return true;
        }
        else {
            return false;
        }
    }
}
