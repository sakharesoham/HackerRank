import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("================================");
            for (int i = 0; i < 3; i++) {
                String word = sc.next();
                int number = sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d\n", word, number);  //when we have to leave 15 character space for the string and 3 character space for the integer
            }
            System.out.println("================================");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }

    }
}