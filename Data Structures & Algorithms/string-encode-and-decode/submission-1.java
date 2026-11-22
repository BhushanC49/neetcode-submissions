class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String word : strs) {
           int length = word.length();
           sb.append(length);
           sb.append("#");
           sb.append(word);
        }
         return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> ans = new ArrayList<>();

        for(int i = 0; i < str.length();){
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int number = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j + 1,j + 1 + number);
            ans.add(word);
            i = j + 1 + number;
            

        }
      return ans;
    }
}
