import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EjercicioTelefono2 {
    public static void main(String[] args) {
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("111");
        telefonos.add("222");

        Map<String, ArrayList<String>> agenda = new HashMap<>();

        agenda.put ("pepe", telefonos);
        telefonos = new ArrayList<>();
        telefonos.add("4444");
        telefonos.add("5555");

        agenda.put("Juan", telefonos);
    }
}
