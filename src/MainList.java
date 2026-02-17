import java.util.*;

public class MainList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C"));

        for (String s : lista) {
            if ("B".equals(s)) {
                lista.remove(s); // Lanza ConcurrentModificationException
            }
        }

        /*esto ocurre ya que el for each que hay en el String s : lista java lo que tiene es como un iterator interno dentro de el
        * que hace que al ocurrir el cambio con el lista.remove el for-each con el iterator interno no reconoce el cambio y por eso lanza la excepcion*/
    }
}