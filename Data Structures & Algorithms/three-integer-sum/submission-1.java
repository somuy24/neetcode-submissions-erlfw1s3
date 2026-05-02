class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int x = 0, l = 1, r = nums.length-1;
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        while(x < nums.length-2) {
            if(x > 0 && nums[x-1] == nums[x]) {
                x++;
                continue;
            }
            l = x+1;
            r = nums.length-1;
            while(l<r) {
                if(nums[x] + nums[l] + nums[r] > 0) {
                    r--;
                } else if(nums[x] + nums[l] + nums[r] < 0) {
                    l++;
                } else if(nums[x] + nums[l] + nums[r] == 0) {
                    ans.add(Arrays.asList(nums[x], nums[l], nums[r]));
                    l++;
                    r--;
                    // skip duplicates for l
                    while (l < r && nums[l] == nums[l - 1]) l++;

                    // skip duplicates for r
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } 
            }
            x++;
        }
        return ans;
    }
}
