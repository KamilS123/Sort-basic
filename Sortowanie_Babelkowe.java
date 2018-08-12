package Week7Day2;

import java.util.Arrays;

public class Sortowanie_Babelkowe {
    public static void main(String[] args) {
        Integer[]tab = {5,45,8,12,4,85,9,26};

       BubbleSort(tab);
    }
    public static void BubbleSort(Integer[]tab) {
        for(int i= 0; i<tab.length-2; i++) {
            for(int j = 0; j<=tab.length-2; j++) {
                if (tab[j] > tab[j+1]) {
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}
