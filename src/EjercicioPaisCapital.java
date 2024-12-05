import java.util.HashMap;
import java.util.Scanner;

public class EjercicioPaisCapital {
    //Declara un HashMap que almacene el país y la capital de varios países Europeos. Luego realiza
    // un programa que pida un País al usuario y muestre su capital.
    public static void main(String[] args) {
        HashMap<String, String> paisesYCapitales = new HashMap<>();

        //paises y caoitales
        paisesYCapitales.put("España", "Madrid");
        paisesYCapitales.put("Alemania", "Berlin");
        paisesYCapitales.put("Bélgica", "Beuselas");
        paisesYCapitales.put("Francia", "París");
        paisesYCapitales.put("Dinamarca", "Copenhague");
        paisesYCapitales.put("Grecia", "Atenas");
        paisesYCapitales.put("Irlanda", "Dublin");
        paisesYCapitales.put("Italia", "Roma");
        paisesYCapitales.put("Reino Unido", "Londres");
        paisesYCapitales.put("Republica Checa", "Praga");


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre de un pais europeo");
        String pais = sc.nextLine();

        if(paisesYCapitales.containsKey(pais)){
            String capital = paisesYCapitales.get(pais);
            System.out.print("La capital de " + pais + " es: " + capital +".");
        }else {
            System.out.println("Este pais no esta en la lista");
        }











    }

}
