public class EjemploCuenta {
    public static void main(String[] args) {
        Cuenta usuario1 = new Cuenta();
        usuario1.setTitular("MARINA SANDOVAL");
        usuario1.setCantidad(1200000);
        usuario1.mostrar();

        System.out.println(usuario1.mostrar());
        System.out.println(usuario1.ingresar(50000.5));
        System.out.println(usuario1.retirar(750000));
    }
}
