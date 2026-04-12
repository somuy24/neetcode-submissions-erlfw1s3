class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int cnt = 0;
        ArrayList<Integer> stp = new ArrayList<>();

        for(int n : nums) {
            hs.add(n);
        }

        for(int n : nums) {
            if(!hs.contains(n-1)) {
                stp.add(n);
            }
        }

        for(int n : stp) {
            int tcnt = 1, tn = n;
            while(hs.contains(tn+1)) {
                System.out.println(tn+1);
                tcnt++;
                tn++;
            }
            cnt = Math.max(tcnt,cnt);
        }

        return cnt;
    }
}
