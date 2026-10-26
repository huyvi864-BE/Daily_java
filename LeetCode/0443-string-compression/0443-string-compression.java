class Solution {
    public int compress(char[] chars) {
        int inde = 0;
        int start = 0;
        for (int i = 0; i <= chars.length; i++){
            if (i == chars.length || chars[i] != chars[start]){
                chars[inde++] =chars[start];
                int count = i -start;
                if (count > 1){
                    for(char c : Integer.toString(count).toCharArray()){
                        chars[inde++] =c;
                    }
                }
                start = i;
            }
        }
        return inde;
    }
}