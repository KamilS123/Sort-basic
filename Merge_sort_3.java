package Week7Day2;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Merge_sort_3 {
    public static void main(String[] args) {
        int[]a1 = {1,2,3};
        int[]a2 = {6,7,8,9,10};

        polaczArray(a1,a2);
    }
    public static void polaczArray(int[]a1, int[]a2) {
        int leng = a1.length *2;
        int[]concatTab = new int[leng];
        int[]a2End = Arrays.copyOfRange(a2,a1.length,a2.length);

        for(int i = 0; i<leng; i++) {
            if(i%2==0) {
                concatTab[i] = a1[i/2];
            } else if (i%2!=0) {
                concatTab[i] = a2[i/2];
            }
        }



         System.out.println(Arrays.toString(concatTab) + " : " + Arrays.toString(a2End));
        }
}
/*Napisz metodę łączącą dwie tablice różnych rozmiarów*/
