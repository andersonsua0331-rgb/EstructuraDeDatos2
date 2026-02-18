package HistorialdeNavegador;
import java.util.Stack;
public class pila{
     public static void main(String[] args) {
          
     
     Stack<String> historial = new Stack<>();

     historial.push("tiktok.com");
     System.out.println("Navegando a: tiktok.com");

     historial.push("youtube.com");
     System.out.println("Navegando a: youtube.com");

     historial.push("instagram.com");
     System.out.println("Navegando a: instagram.com");

     System.out.println("url actual: "+ historial.peek());

     if(!historial.empty());
     String url1 =  historial.pop();
     System.out.println("url recuperada: "+ url1);

     try {
          while (true) {
               String url = historial.pop();
               System.out.println("elimunando:"+ url);
          }
          
     } catch (Exception EmptyStackException) {
          // TODO: handle exception
     }



     
     }
}
