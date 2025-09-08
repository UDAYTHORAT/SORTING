import java.util.Arrays;

public class Finding_duplicate_values_in_array {
    public static void main(String[] args) {
        int[] a= {1,2,2};
       int result= Sort(a);
        System.out.println(result);
    }
    static int Sort(int[] a){

        int i=0;
        while(i<a.length){
            if(a[i]!=i+1){
            int correct=a[i]-1;
            if(a[i]!=a[correct]) {
                int temp = a[i];
                a[i] = a[correct];
                a[correct] = temp;
            }else {
                return a[i];
            }
            }else {
                i++;
            }

        }



        return 0;
    }
}
