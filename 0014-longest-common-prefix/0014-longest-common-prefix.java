class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        
        // Duyệt qua các chuỗi còn lại
        for (int i = 1; i < strs.length; i++) {
            // Hàm indexOf trả về 0 nếu chuỗi strs[i] bắt đầu bằng prefix
            // Nếu không bắt đầu bằng prefix (khác 0), ta phải cắt bớt prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Cắt bỏ ký tự cuối cùng của prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna