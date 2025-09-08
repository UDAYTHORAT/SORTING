import java.util.Arrays;

public class Set_MIsMatch {
    public static void main(String[] args) {
        int [] a={1,1};
        int[] result= Sort(a);
        System.out.println(Arrays.toString(result));


    }
    static int[] Sort(int[]a){
        int i=0;
        int[]sol={-1,-1};
        while (i<a.length){
            int correct=a[i]-1;
            if(a[i]!=a[correct]){
                int temp=a[i];
                a[i]=a[correct];
                a[correct]=temp;

            }else {
                i++;
            }
        }
        for (int j = 0; j <a.length ; j++) {
             if(a[j]!=j+1){
                sol= new int[]{a[j], j + 1};
             }
        }
        return  sol;
    }
}
