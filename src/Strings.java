import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        if (name1.equals(name2)){
            System.out.println("two people have the same name");
        } else{
            System.out.println("two people don't have the same name");
        }
    }
}
