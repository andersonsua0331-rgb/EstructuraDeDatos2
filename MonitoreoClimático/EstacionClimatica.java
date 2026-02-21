package MonitoreoClimático;

public class EstacionClimatica {
    public static void main(String[] args) {
        
    
    double [] temperaturas = new double[23];
    for (int i = 0;  i < temperaturas.length; i++) {
        temperaturas[i] = Math.random() * 40;
    }
    System.out.println("la temperatura del medio dia es:" + temperaturas[13] + "°c");
    
    try {
        System.out.println("la tempetarura a las 25 horas es: "+temperaturas[25]);
        temperaturas[25]=22;
    } 
    catch ( ArrayIndexOutOfBoundsException e) {
        System.out.println("el valor en la posicion 25 es fija");

        // TODO: handle exception
        
    }
}

}

