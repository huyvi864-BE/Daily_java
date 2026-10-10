public class do_while02 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if(i % 10 == 0){
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 1000);
    }
}