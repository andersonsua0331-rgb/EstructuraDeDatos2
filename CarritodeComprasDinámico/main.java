package CarritodeComprasDinámico;

public class main {
    public static void main(String[] args) {
    Carrito carrito = new Carrito();
        Producto P1= new Producto(25, "arroz", 5.000);
        
        carrito.AgregarProducto(P1);

        System.out.println("carrito: "+P1);
        carrito.mostrarcarrito();

        carrito.EliminarProducto(P1);

        System.out.println("carrito vacio: ");
        carrito.mostrarcarrito();



        }


    }
    

