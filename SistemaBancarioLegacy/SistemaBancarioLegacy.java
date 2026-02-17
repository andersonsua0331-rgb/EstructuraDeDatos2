package SistemaBancarioLegacy;

import java.util.Vector;

public class SistemaBancarioLegacy {
    public static void main(String[] args) {
        Vector<String> logTransacciones = new Vector<>();

        logTransacciones.add("transaccion #1");
        logTransacciones.add("transaccion #2");
        logTransacciones.add("transaccion #3");
        logTransacciones.add("transaccion #4");
        logTransacciones.add("transaccion #5");

  //se bloquean los objetos para no cruzar hilos 

    }
}
