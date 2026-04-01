class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }

        for(int j=0;j<nums.length;j++){
            if(mp.containsKey(target-nums[j]) && j!=mp.get(target-nums[j]))
            return new int[] {j,mp.get(target-nums[j])};
        }

        return new int[2];
    }
}
