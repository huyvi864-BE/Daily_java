package BaiTap;
import java.util.Scanner;
public class Products {
    public static int digitsProduct(int product) {
        if (product == 0) return 10;
        if (product < 10) return product;

    StringBuilder sb = new StringBuilder();
    for (int i = 9; i >= 2; i--) {
        while (product % i == 0) {
            sb.append(i);
            product /= i;
        }
    }

    if (product > 1) return -1;
    return Integer.parseInt(sb.reverse().toString());
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product: ");
        int product = scanner.nextInt();
        int result = Products.digitsProduct(product);
        System.out.println(result); // Output: 49
    }
}