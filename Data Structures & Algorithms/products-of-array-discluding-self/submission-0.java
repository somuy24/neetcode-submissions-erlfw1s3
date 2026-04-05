class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int product = 1;
        int cntZeros = 0;
        for(int n : nums) {
            if(n==0)
            cntZeros++;
            else
            product*=n;
        }

        // System.out.println(cntZeros);
        // System.out.println(product);

        if(cntZeros>1) {
            Arrays.fill(ans, 0);
            return ans;
        }

        for(int i=0;i<nums.length;i++) {
            if(cntZeros == 1 && nums[i] != 0){
                ans[i] = 0;
            } else if(cntZeros == 1 && nums[i] == 0){
                ans[i]=product;
            }
            else {
                ans[i]=product/nums[i];
            }
        }

        return ans;
    }
}  
