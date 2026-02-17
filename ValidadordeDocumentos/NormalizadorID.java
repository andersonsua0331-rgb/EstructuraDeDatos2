package ValidadordeDocumentos;

public class NormalizadorID {
    public static void main(String[] args) {
    String idSucio = " User_123 ";

    String idLimpio = idSucio.trim().toUpperCase().substring(0);
    System.out.println("id limpio:" + idLimpio);

    System.out.println(System.identityHashCode(idSucio));
    System.out.println(System.identityHashCode(idLimpio));

    StringBuilder builder = new StringBuilder(idLimpio);

    builder.reverse();

    String idInvertido = builder.toString();
    System.out.println("id invertido:" + idInvertido);
    }
}
