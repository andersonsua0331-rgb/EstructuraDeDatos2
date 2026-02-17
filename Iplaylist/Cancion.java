public class Cancion{

private String Artista;
private String Titulo;
private double Duracion;
public Cancion(double Duracion, String Artista, String Titulo){
    
    this.Artista=Artista;
    this.Titulo=Titulo;
    this.Duracion=Duracion;
}
    public String getArtista(){
    return Artista;
    }
     public void setArtista(String Artista){
        this.Artista= Artista;
    }

    public String getTitulo(){
    return Titulo;
    }
    public void setTitulo(String Titulo){
        this.Titulo= Titulo;
    }

    public double getDuracion(){
    return Duracion;
    }
    public void setDuracion(double  Duracion){ 
        this.Duracion= Duracion;
    }
    
    public void mostrarInfo(){
        System.out.println("Artista"+ Artista);
        System.out.println("Titulo"+ Titulo );
        System.out.println("Duracion"+ Duracion);
    }

    
 
}