import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileTextt {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(new File("Hello.txt"))) {
            if (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            } else {
                System.out.println("File rỗng, không có dòng nào để đọc.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file Hello.txt: " + e.getMessage());
        }
    }
}

