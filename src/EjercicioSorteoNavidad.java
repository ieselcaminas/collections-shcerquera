import java.util.HashMap;
import java.util.Map;

public class EjercicioSorteoNavidad {
    public static void main(String[] args) {
        String[] boletos = {"45069", "37095", "12874", "36547", "22987"};
        Map<Character, Integer> terminaciones = contarTerminaciones(boletos);
        System.out.println(terminaciones);

    }

    private static Map<Character, Integer> contarTerminaciones(String[] boletos) {
        Map<Character, Integer> contadorTerminaciones = new HashMap<>();
        for (String boleto : boletos) {

            char untimo = boleto.charAt(boleto.length() - 1);

            Integer contador = contadorTerminaciones.get(untimo);

            if (contador == null) {
                contadorTerminaciones.put(untimo, 1);
            } else {
                contadorTerminaciones.put(untimo, contador + 1);
            }

        }
        return contadorTerminaciones;

    }
}
