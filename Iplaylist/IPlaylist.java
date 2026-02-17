public interface IPlaylist {
 
 void agregarCancion(Cancion insertCancion);
 void eliminarCancion(String titulo);
 Cancion reproducirSiguiente();
 void vaciarLista();
 int obtenerCantidadCanciones();
}