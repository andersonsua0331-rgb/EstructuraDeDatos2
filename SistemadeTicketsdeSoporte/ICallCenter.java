package  SistemadeTicketsdeSoporte;
import java.util.Queue;
import java.util.LinkedList;
public interface ICallCenter {
    public static void main(String[] args) {
        
    
    Queue<String> colaSoporte = new LinkedList<>();

    colaSoporte.add("Cliente A");
    colaSoporte.add("Cliente B");

    System.out.println("El siguiente en la fila es: "+ colaSoporte.peek());

    
    System.out.println("Atendiendo a: "+ colaSoporte.poll());

    }
}
    

