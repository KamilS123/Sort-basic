package Week7Day2;

import java.util.Arrays;

public class Sortowanie_Babelkowe_Piramidka {
    public static void main(String[] args) {
        Integer[]tab = {5,7,9,82,52,45,62,45,4};
bubble_sort(tab);
    }
    public static void bubble_sort(Integer[]tab) {
        for(int i = 0; i<tab.length; i++) {
            for(int j = 0; j<tab.length-i-1; j++) {
               // System.out.println(j + ":" + tab[j]+ " ");

                if (tab[j] > tab[j+1]) {
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                     //System.out.println(tab[j]);
                }
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}
