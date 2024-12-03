import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EjercicioAnagrama {
    //    public static void main(String[] args) throws IOException {
//        String palabras = "casa, boca, gotas";
//
//        BufferedReader reader = new BufferedReader(new FileReader(Arrays.toString(palabras.toCharArray())));
//        String line;
//        Map<String, List<String>> anagrama = new HashMap<>();
//
//        while ((line = String.valueOf(reader.readLine() != null) {
//
//            String palabra = line.trim().toLowerCase();
//
//            char[] chars =palabra.toCharArray();
//            Arrays.sort(chars);
//
//        }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("path-to-file"));
        String palabra;
        String ordenada;
        ArrayList<String> palabras = null;
        Map<String, ArrayList<String>> anagrama = new HashMap<>();
        while ((palabra = reader.readLine()) != null) {
            //Trabajar con line
            ordenada = alphabetize(palabra);
            palabra = String.valueOf(anagrama.get(ordenada));

            if (palabras == null) {
                palabras = new ArrayList<>();
                palabras.add(palabra);
                anagrama.put(ordenada, palabras);
            }
        }
        reader.close();

    }

    private static String alphabetize(String palabras) {

        char[] ordenadas = palabras.toCharArray();
        Arrays.sort(ordenadas);
        return new String(ordenadas);

    }

}





