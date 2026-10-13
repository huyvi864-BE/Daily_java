class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int i = 0;
        while(i< word1.length() || i < word2.length()){
            if (i< word1.length()){
                merge.append(word1.charAt(i));
            }
            if (i< word2.length()){
                merge.append(word2.charAt(i));
            }
            i++;
        }
        return merge.toString();
    }
}