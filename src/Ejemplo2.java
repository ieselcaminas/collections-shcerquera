import java.util.ArrayList;
//la media de un arraylis
public class Ejemplo2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(15);
        numeros.add(16);
        numeros.add(20);
        numeros.add(17);
        numeros.add(14);

        double suma = 0;
        //int suma = 0;
        //for (int numero : numeros){
        //    suma += numero;
       // }
       // double media = (double) suma  / numeros.size();

      //  System.out.print("la media es: " + media);

        for (int i = 0; i < numeros.size() ; i++) {
            suma += numeros.get(i);

            System.out.println(suma/ numeros.size());


        }
    }

}
