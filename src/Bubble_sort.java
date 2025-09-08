import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int [] a={5,3,2,7,1};
        Sort(a);
        System.out.println(Arrays.toString(a));

    }
    static void Sort(int [] a) {

        for (int i = 0; i < a.length; i++) {
            boolean swap = false;

            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                swap = true;

            }
            if (!swap) {
                break;
            }

        }

    }
}
