import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int [] a= {10,3};
        insertion_sort(a);
        System.out.println(Arrays.toString(a));

    }
    static void insertion_sort(int [] a){

        for (int i = 0; i<=a.length-2; i++) {
            for (int j = i+1; j <=a.length-1 && j>0; j--) {
                if(a[j]<a[j-1]){
                        int temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                }else {
                    break;
                }

            }


        }
    }
}

