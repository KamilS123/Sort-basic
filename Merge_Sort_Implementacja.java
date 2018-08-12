package Week7Day2;

public class Merge_Sort_Implementacja {
    public static void main(String[] args) {
        Integer[]tab = {1,5,9,4,5,7,8,1,3};
        Merge(tab,2,5,6);

    }
    public static void Merge(Integer[]tab, int left, int mid, int right) {
        int i = 0;
        int j = 0;
        int[]T =new int [tab.length];

        for( i = mid + 1; i<left; i++) {
            T[i-1] = tab[i-1];
        }
        for(j = mid; j<=right; j++) {
            T[right+mid-j] = tab[j+1];
        }
        for(int k = left; k<right+1; k++) {
            if(T[j]<T[i]){
                tab[k]=T[j];
                j=j-1;
            } else {
                tab[k] = T[i];
                i=i+1;
            }
        }
    }
}
