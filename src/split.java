import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        String s = "Welcome to codelearn!";
        String[] words = s.split(" ");
        for(String word:words) {
            System.out.println(word);
        }
    }
}