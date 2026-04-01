class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i=0;i<s.length();i++){
            arr1[(s.charAt(i) - 97)]++;
        }

        for(int j=0;j<t.length();j++){
            arr2[(t.charAt(j) - 97)]++;
        }

        return Arrays.equals(arr1, arr2);
    }
}
