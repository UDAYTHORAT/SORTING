import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int [] a= {3,9,7,10,-1,2};

        Buble_sort(a);
        System.out.println(Arrays.toString(a));

        Selection_sort(a);
        System.out.println(Arrays.toString(a));


    }
    static void Buble_sort(int [] a){

        for (int i = 0; i <a.length; i++) {
        boolean swap=false;
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                    int temp= a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }

                swap=true;

            }

            if(!swap){
                break;
            }
        }
    }
    static void Selection_sort(int [] a){

        for (int i = 0; i <a.length-1; i++) {
            int last = a.length-i-1;
            int max=0;

            for (int j = 0; j <=last ; j++) {
                if(a[j]>a[max]){
                    max=j;
                }
            }
            int temp = a[last];
            a[last]=a[max];
            a[max]=temp;
        }
    }

}
