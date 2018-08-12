package Week7Day2;

public class Wartosc_Z_Indeksem {
    public static void main(String[] args) {
        wypisz_z_indexem();
    }

    public static void wypisz_z_indexem() {
        Integer[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i + ":" + tab[i] + " ");
        }
    }
}
/*Napisz metodę wypisującą wartości w tablicy razem z numerem indeksu. Przykład:
[0:123, 1:22, 2:98]*/