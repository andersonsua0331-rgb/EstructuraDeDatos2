package CarritodeComprasDinámico;
import java.util.ArrayList;
import java.util.List;

public class Carrito{
    List<Producto> Carrito = new ArrayList<>();

    
    public void AgregarProducto(Producto nuevoProducto){
        if (!Carrito.contains(nuevoProducto))
        Carrito.add(nuevoProducto);

    }

    public void EliminarProducto(Producto Producto){
        Carrito.remove(Producto);
    }

    public void mostrarcarrito(){
        for(Producto producto: Carrito){
            System.out.println(producto);
        }
        
    }



}