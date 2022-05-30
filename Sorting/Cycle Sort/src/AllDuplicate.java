import java.util.ArrayList;
import java.util.List;

public class AllDuplicate {
    static List<Integer> cyclic(int[] nums){
        int i = 0;
        while(i < nums.length){
            int n = nums[i] - 1;
            if(nums[i] != nums[n]){
                int temp = nums[i];
                nums[i] = nums[n];
                nums[n] = temp;
            }
            else{
                i++;
            }
        }
        List<Integer> solution = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                solution.add(nums[index]);
            }
        }
        return solution;
    }
}
