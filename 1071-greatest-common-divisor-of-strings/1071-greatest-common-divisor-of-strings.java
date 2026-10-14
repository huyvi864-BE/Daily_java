class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()){
            return gcdOfStrings(str2, str1);
        }
        if (str2.isEmpty()){
            return str1;
        }
        if (!str1.startsWith(str2)){
            return "";
        }
        String remaining = str1.substring(str2.length());
        return gcdOfStrings(remaining, str2);
    }
}