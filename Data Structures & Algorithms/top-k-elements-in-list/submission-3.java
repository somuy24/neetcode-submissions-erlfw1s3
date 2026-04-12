class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];
        int[] ans = new int[k];

        for(int n : nums) {
            hm.put(n,hm.getOrDefault(n,0) + 1);
        }

        for(int i=0;i<freq.length;i++) {
            freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        for(int i = nums.length;i>0;i--) {
            if(freq[i]!=null){
                if(k>0) {
                    for(int n : freq[i]){
                        ans[k-1] = n;
                        k--;
                    }
                }
            }
            
        }

        return ans;
    }
}
