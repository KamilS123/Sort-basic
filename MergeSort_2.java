package Week7Day2;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort_2 {
    public static void main(String[] args) {
        int[]a1 = {1,2,3,4,5};
        int[]a2 = {6,7,8,9,10};

        polaczTab(a1,a2);
    }
    public static void polaczTab(int[]a1, int[]a2) {
      int lengthBoth = a1.length+a2.length;

      int[]bothTabs = new int[lengthBoth];

      System.arraycopy(a1,0,bothTabs,0,a1.length);
      System.arraycopy(a2,0,bothTabs,a1.length,a2.length);

      for(Integer i : bothTabs) {
          System.out.print(i + ",");
      }
        System.out.println("\n");
/////////////////////////////////////////////////////////////////////

        for(int i = 0; i<lengthBoth; i++) {
            if(i%2==0) {
                bothTabs[i]=a1[i/2];
          } else if(i%2!=0) {
                bothTabs[i]=a2[i/2];
            }

      }
        System.out.println(Arrays.toString(bothTabs));

    }
}
/*Napisz metodę łączącą dwie tablice takiego samego rozmiaru (a1, a2)
=> a1[0], a2[0], a1[1], a2[1], itd.*/