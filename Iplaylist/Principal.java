public class Principal{
    public static void main(String[] args) {

    Cancion cancion= new Cancion(160, "jeison jimenez", "el mejor caballo");
System.out.println("Artista: " + cancion.getArtista());
System.out.println("Titulo: " + cancion.getTitulo());
System.out.println("Duracion: " + cancion.getDuracion()+ "segundos");

    }
}