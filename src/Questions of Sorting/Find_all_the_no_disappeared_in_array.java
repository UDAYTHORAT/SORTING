import java.util.Arrays;

public class Find_all_the_no_disappeared_in_array {
    public static void main(String[] args) {
        int[] a={1,1};
        Sort(a);
        System.out.println(Arrays.toString(a));

    }
    static void Sort(int[]a) {

        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
                if (a[i] != a[correct]) {
                    int temp = a[i];
                    a[i] = a[correct];
                    a[correct] = temp;
                } else {
                    i++;
                }

        }

        for (int j = 0; j < a.length ; j++) {
            if(a[j]!=j+1){
                System.out.println(j+1);
            }

    }

    }
}
