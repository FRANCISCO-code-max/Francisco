
package Cuentas;

public class EntornosDesarrollo {

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        float saldoActual;

            operativa_cuenta(2500.0f);
    }

        public static void operativa_cuenta(float cantidad) {
            CCuenta cuenta1;
            float saldoActual = cantidad;
            cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",saldoActual,0);
            saldoActual = cuenta1.estado();
            try {
                cuenta1.retirar(2300);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }   try {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(695);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
        }
    }
}