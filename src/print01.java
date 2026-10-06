import java.util.Scanner;

public class print01 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i * 5 + j + " ");
            }
            System.out.println();
        }
    }
}