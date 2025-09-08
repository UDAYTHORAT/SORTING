import java.util.Arrays;

public class Missing_No_question {
    public static void main(String[] args) {

        int[] a = {1,3,0};
         int result= Missing(a);
        System.out.println(result);
        System.out.println(Arrays.toString(a));


    }

    static int Missing(int[] nums) {

        int i = 0;

        while (i < nums.length) {
            int correct = nums[i];
            if (correct < nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j <nums.length; j++) {
            if(nums[j]!=j){
                return j;
            }
        }

        return nums.length;
    }

}




