package Week7Day2;

public class Szukanie_minimum_tablicy {
    public static void main(String[] args) {
        findMinimum();
        wypisz_od_a_do_b(2,6);
    }
    public static void findMinimum() {
        int[] tab = {1, 43, 4, 23, 12, 5, 6, 90, 5, 34};

        int dlugosc = tab.length;                           //find minimum
        int pozycja = tab[0];
        for (int i = 0; i < dlugosc; i++) {

            if (tab[i] < pozycja)
                pozycja = tab[i];
        }
        System.out.println("Minimum to: " + pozycja);
    }

    public static void wypisz_od_a_do_b(int a, int b) {
        int[] tab2 = {1, 43, 4, 2, 12, 5, 6, 90, 5, 34};
        int pozycja = tab2[a];                                   //szukanie miimum z zakresu

        for(int i = tab2[a]; i<tab2[b]; i++) {
            if(tab2[i]<pozycja) {
                pozycja = tab2[i];
            }
        }
        System.out.println("Minimum z zakresu " + pozycja );

    }

}
