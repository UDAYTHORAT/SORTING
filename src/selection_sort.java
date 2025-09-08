import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {

        int [] a={5,7,6,3};
        Selection_sort(a);
        System.out.println(Arrays.toString(a));



    }
    static void Selection_sort(int[] a){


        for (int j = 0; j <a.length-1; j++) {
            int last= a.length-j-1;
            int maxindex=0;
            for (int i = 0; i <=last ; i++) {
                if(a[i]>a[maxindex]){
                    maxindex=i;
                }
            }
            int temp= a[last];
            a[last]=a[maxindex];
            a[maxindex]=temp;



        }
    }
}
