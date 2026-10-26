import java.util.Stack;
class Solution {
    public String reverseVowels(String s) {
        String vowels ="aeiouAEIOU";
        Stack<Character> stack = new Stack<>();

        for (char c :s.toCharArray()){
            if (vowels.indexOf(c) != -1){
                stack.push(c);
            }
        }
        char[] list = s.toCharArray();
        for(int i= 0; i< list.length; i++){
            if(vowels.indexOf(list[i]) != -1){
                list[i] = stack.pop();
            }
        }
        return new String(list);
    }
}