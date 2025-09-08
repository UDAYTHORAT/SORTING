import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int [] a={7,8,9,11,12};
        Cyclic_sort(a);
        System.out.println(Arrays.toString(a));

    }
    static void Cyclic_sort(int [] a){
        int i=0;
        while (i<a.length-1){
           int correct =a[i]-1;
            if(a[i]!=a[correct]){
                int temp =a[i];
                a[i]=a[correct];
                a[correct]=temp;
            }else {
                i++;
            }

        }
    }
}
