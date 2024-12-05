import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioTelefono1 {
    public static void main(String[] args) {
        HashMap<String,String> telefonos = new HashMap<>();
        telefonos.put("Teresa","123456");
        telefonos.put("Juan","124578");
        telefonos.put("Camilo","236589");

        //leer la entrada del usuariio
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del contacto ");
        String contacto = sc.nextLine();;

        //buscar y filtrar el número
        if(telefonos.containsKey(contacto)){
            String numeroTelefono = telefonos.get(contacto);
            System.out.print("El numero de telefono de este contacto es: " + numeroTelefono);
        }else {
            System.out.println("No tenemos este contacto guardado en la agenda");
        }


    }
}
