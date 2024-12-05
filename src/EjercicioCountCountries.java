import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EjercicioCountCountries {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("Colfuto-Seleccionados.csv"));
        String pais;
        reader.readLine();

        String paisBuscado = args[7];
        //Map<String, Integer> paises = contarAlumnosPais("Colfuto-Seleccionados.csv");
//
//        Integer cantidad = paises.get(paisBuscado);
//        if( cantidad !=null){
//            System.out.println("Cantidad alumnos de: " + paisBuscado+ ": " + cantidad);
//        }else {
//            System.out.println("Nose encontro la información");
//        }
//    }
//
//   // private static Map<String, Integer> contarAlumnosPais(String paises) {
//        Map<String, Integer> pais =new HashMap<>();
//
//
//    }
//

//}
    }
}