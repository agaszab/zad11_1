import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        int liczba = 0;
        while (liczba >= 0) {
            System.out.println("Wprowadź liczbę:");
            try {
                liczba = scan.nextInt();
            } catch (NumberFormatException n) {
                System.out.println("nie podałes liczby całkowitej"); }
            if (liczba >= 0) lista.add(liczba);
        }


        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }


        int suma = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
            max = Integer.max(max, lista.get(i));
            if (lista.get(i) < min) min = lista.get(i);
            if (i == lista.size() - 1) System.out.print(lista.get(i) + " = ");
            else System.out.print(lista.get(i) + " + ");
        }

        System.out.println(suma);


        System.out.println("Największy element listy: " + max);
        System.out.println("Najmniejsza element listy: " + min);
    }
}
