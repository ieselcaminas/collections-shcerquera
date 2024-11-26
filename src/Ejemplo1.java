import java.util.ArrayList;

public class Ejemplo1 {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        coches.add("Seat");
        coches.add("Audi");
        coches.add("BMW");
        coches.add("Honda");

//        System.out.print(coches.get(coches.size()-1));
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
        coches.remove(0);
        System.out.println("-------");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
        if (coches.isEmpty()){
            System.out.println();
        }

    }

}
