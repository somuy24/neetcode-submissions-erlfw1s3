class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedS = new StringBuilder();

        for(String s : strs) {
            encodedS.append(s.length());
            encodedS.append("#");
            encodedS.append(s);
        }

        return encodedS.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedS = new ArrayList<>();
        int i = 0;

        while(i<str.length()){
            int j=i;

            while(str.charAt(j) != '#') {
                j++;
            }
            System.out.println(j);

            int len = Integer.parseInt(str.substring(i,j));
            
            i=j+1;
            j=len+i;
            decodedS.add(str.substring(i,j));
            i=j;
        }

        return decodedS;
    }
}
