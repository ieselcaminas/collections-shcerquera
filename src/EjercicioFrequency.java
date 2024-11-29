import java.util.HashMap;
import java.util.Map;

public class EjercicioFrequency {
    public static void main(String[] args) {
        String[] palabras = {"hola", "azul", "hola", "rojo", "adios", "hola","", "rojo"};

        Map<String, Integer> contarPalabras = new HashMap<>(contadorFrecuencia(palabras));

              for(String cPalabra : contarPalabras.keySet()){
            System.out.print(palabras + ": " + contarPalabras.get(cPalabra) + "vez/veces");

        }

    }
    public static Map<String, Integer> contadorFrecuencia (String [] palabras){

        Map<String, Integer> contador = new HashMap<>();

        for (String palabra :palabras){
            contador.put(palabra, contador.get(0) +1);
        }
        return contador;
    }
}
