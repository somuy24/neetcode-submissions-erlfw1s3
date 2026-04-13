class Solution {
    public boolean isPalindrome(String s) {
        String stemp = s.toLowerCase();
        int st = 0, end = s.length()-1;

        System.out.println(stemp);

        while(st<end) {
            if(!((stemp.charAt(st) >= 'A' && stemp.charAt(st) <= 'Z') || 
            (stemp.charAt(st) >= 'a' && stemp.charAt(st) <= 'z') || 
            (stemp.charAt(st) >= '0' && stemp.charAt(st) <= '9'))) {
                st++;
            } else if(!((stemp.charAt(end) >= 'A' && stemp.charAt(end) <= 'Z') || 
            (stemp.charAt(end) >= 'a' && stemp.charAt(end) <= 'z') || 
            (stemp.charAt(end) >= '0' && stemp.charAt(end) <= '9'))) {
                end--;
            } else if (stemp.charAt(st) != stemp.charAt(end)) {
                return false;
            } else {
                st++;
                end--;
            }
        }

        System.out.println(st);
        System.out.println(end);

        return true;
    }
}
