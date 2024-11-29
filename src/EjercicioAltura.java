import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioAltura {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Double> alturas = new ArrayList<>();

        numeroAlumnos();
        leerAltura(alturas);
        double media = calcularMedia(alturas);
        int mayor = calcularMayor(alturas, media);
        int menor = calcularMenor(alturas,media);
        System.out.println(mayor);
        System.out.println(menor);

    }

    public static int numeroAlumnos() {
        Scanner sc = new Scanner(System.in);
        int alumnos = sc.nextInt();
        System.out.println("Ingrese el numero de alumnos: ");

        return alumnos;
    }

    public static void leerAltura(ArrayList<Double> alturas) {

        double estatura = sc.nextDouble();
        System.out.print("Ingrese su estatura: " + estatura);

        for (int i = 0; i < alturas.size(); i++) {
            alturas.add(sc.nextDouble());
        }

    }

    public static double calcularMedia(ArrayList<Double> alturas) {
        double suma = 0;

        for (int i = 0; i < alturas.size(); i++) {
            suma += alturas.get(i);

        }

        return suma / alturas.size();
    }

    public static int calcularMayor(ArrayList<Double> alturas, double media) {
        int contadorAltos = 0;
        for (double estatura : alturas) {
            if (estatura > media) {
                contadorAltos++;
            }
        }
        return contadorAltos;


    }
    public static int calcularMenor (ArrayList<Double> alturas, double media){
        int contador =0;
        for (double estatura : alturas){
            if (estatura < media){
                contador++;
            }
        }
        return contador;
    }

}
