package Week7Day2;

import java.util.Arrays;

public class Zamienia_miejscami_tablice {
    public static void main(String[] args) {
        Integer[]tab = {1,2,3,4,5,6,7,8,9};
        wypisz(tab);
    }
    public static void wypisz(Integer[]tab) {
        for(int i = 0; i<tab.length; i++) {

            System.out.println(Arrays.toString(tab));

        }
    }
}
