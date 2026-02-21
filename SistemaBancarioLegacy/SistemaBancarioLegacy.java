package SistemaBancarioLegacy;

import java.util.ArrayList;
import java.util.Vector;

public class SistemaBancarioLegacy {
    public static void main(String[] args) {
        Vector<String> logTransacciones = new Vector<>();

        logTransacciones.add("transaccion 1");
        logTransacciones.add("transaccion 2");
        logTransacciones.add("transaccion 3");
        logTransacciones.add("transaccion 4");
        logTransacciones.add("transaccion 5");

        System.out.println(logTransacciones);

  // múltiples hilos acceden simultáneamente a una colección y todos los datos dentro del vector son sincronizados intrínsecamente

  int cantidad =1000000;

  Vector<String> vector= new Vector<>();
  long inicioVector= System.currentTimeMillis();
  for (int i=0; i<1000000;i++){
    
  }


  ArrayList<String> arrayList= new ArrayList<>();
  long inicioArray= System.currentTimeMillis();
  for (int i=0; i<1000000; i++){

  }

  long fin=System.currentTimeMillis();

  System.out.println("Tiempo de vector: "+(fin-inicioVector));
  System.out.println("Tiempo de ArrayList: "+(fin-inicioArray));





  

    }
}
