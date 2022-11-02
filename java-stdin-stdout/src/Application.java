import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int i = scan.nextInt();
            Double d = scan.nextDouble();
            scan.nextLine();
            String s = scan.nextLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }
    }
}