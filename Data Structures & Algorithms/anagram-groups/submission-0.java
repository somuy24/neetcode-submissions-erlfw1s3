class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        Map<String, List<Integer>> mp = new HashMap<>();

        for(int i=0;i<strs.length;i++) {
            char[] chArr = strs[i].toCharArray();
            Arrays.sort(chArr);
            String s = new String(chArr);

            System.out.println(s);

            if(mp.containsKey(s)){
                List<Integer> temp = mp.get(s);
                temp.add(i);
                mp.put(s,temp);
            }

            mp.putIfAbsent(s,new ArrayList<>(List.of(i)));
        }

        // System.out.println(mp.get("opst"));
        // System.out.println(mp.get("pots"));
        // System.out.println(mp.get("tops"));

        for(Map.Entry<String, List<Integer>> m : mp.entrySet()){
            List<String> st = new ArrayList<>();
            for(Integer a : m.getValue()){
                st.add(strs[a]);
            }
            ans.add(st);
        }

        return ans;
    }
}
