package object;

import java.util.Arrays;

public class twosum {

    public static  int[] twosum1(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(target==nums[i]+nums[j])
                {
                int[] array={i,j};
                    return array;


                }
            }


        } throw new IllegalArgumentException("No two sum solution");

    }



    public static void main(String[] args) {
    int[] news={2,7,11,15};
    int target=9;
   int[] max= twosum1(news,target);
        System.out.print("输出为");

            System.out.println(Arrays.toString(max));



    }
}
