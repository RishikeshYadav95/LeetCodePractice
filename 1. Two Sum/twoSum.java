import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap vault = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(vault.containsKey(nums[i])) {
            	return new int[] {(int)vault.get(nums[i]), i};         	
            }
            else {
            	vault.put(target-nums[i], i);
            }
        }
        return new int[] {};
    }
}
