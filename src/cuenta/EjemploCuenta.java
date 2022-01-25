package cuenta;

import cuenta.Cuenta;
import cuentaJoven.CuentaJoven;

public class EjemploCuenta {
    public static void main(String[] args) {
        Cuenta usuario1 = new Cuenta();
        usuario1.setTitular("MARINA SANDOVAL");
        usuario1.setCantidad(1200000);
        usuario1.mostrar();

        CuentaJoven cuentaJoven1 = new CuentaJoven();
        cuentaJoven1.setEdad(33);
        cuentaJoven1.setBonificacion(0.08);
        cuentaJoven1.esTitularValido();

        System.out.println(usuario1.mostrar() + "\nCuenta Joven" + "\nBonificacion " + cuentaJoven1.getBonificacion() + "%");
        System.out.println(usuario1.ingresar(50000.5));
        System.out.println(usuario1.retirar(750000));
        System.out.println(cuentaJoven1.esTitularValido());
    }
}
