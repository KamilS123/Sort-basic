package Week7Day2;

import java.util.Arrays;

public class Wypisz_Ile_posiada_elementow {
    public static void main(String[] args) {
        Integer[]tab = {1,2,3,4,5,6,7,8,9};
        wypisz(tab);
    }
    public static void wypisz(Integer[]tab) {

        for(int i = 0; i<tab.length; i++) {
                System.out.print(i + ":" + tab[i] + " ");
        }
    }
}
/*Napisz metodę która będzie wypisywać zawartość tablicy w tylu wierszach ile posiada
elementów. Przykład:
[0:43, 1:56, 2:11]
[0:43, 1:56, 2:11]
[0:43, 1:56, 2:11]*/