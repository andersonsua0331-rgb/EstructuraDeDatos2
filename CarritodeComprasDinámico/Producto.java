package CarritodeComprasDinámico;

public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio){
        this.id= id;
        this.nombre= nombre;
        this.precio= precio;
    }

    public int getid(){
        return id;
    }

    public String getnombre(){
        return nombre;
    }

    public double getpercio(){
        return precio;
    }
    





    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
}