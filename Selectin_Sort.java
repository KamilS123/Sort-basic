package Week7Day2;

import java.util.Arrays;

public class Selectin_Sort {
    public static void main(String[] args) {
        Integer[]tab = {8,5,6,2,15,48,61,8,45,2};
        SelectionSort(tab);
    }
    public static void SelectionSort(Integer[]tab) {
        for(int i = 0; i<tab.length; i++) {
            int min = i;
            for(int j = i+1; j< tab.length-1; j++) {
                if(tab[j]<tab[min]) {
                    min = tab[j];
                }

                int temp = tab[j];
                tab[i] = tab[min];
                tab[min] = temp;
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}
