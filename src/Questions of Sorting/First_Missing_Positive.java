import java.util.Arrays;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] a = {7,8,9,11,12};
       int result= Sort(a);
        System.out.println(result);

    }

    static int Sort(int[] a) {

        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] > 0 && correct < a.length && a[i] != a[correct]) {
                int temp = a[i];
                a[i] = a[correct];
                a[correct] = temp;
            } else {
                i++;
            }
        }

            for (int j = 0; j <a.length ; j++) {
                if(a[j]!=j+1){
                    return j+1;
                }

            }

           return a.length+1;


        }
    }

