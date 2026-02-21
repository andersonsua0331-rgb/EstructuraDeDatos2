package InventarioporCódigo;
import java.util.HashMap;
import java.util.Map;


public class Inventario {
    public static void main(String[] args) {
        Map<String, String> inventario = new HashMap<>();

        inventario.put("A001", "Laptop Dell");
        inventario.put("A001", "Laptop HP");

        System.out.println("sobrescritura: "+ inventario.get("A001"));

        System.out.println(inventario.get("A001"));
        System.out.println(inventario.get("A002"));



        
    }
    
}
// el get que no recorre todo el codigo es inventario.get("A001") Porque usa el mecanismo interno de hash para acceder directamente al valor asociado a la clave
