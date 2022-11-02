//import java.util.*;

import java.util.Scanner;

public class Application {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            int N = scanner.nextInt();
            String answer = "";
            if (N % 2 == 1) {
                answer = "Weird";
            } else if (N % 2 == 0 && N >= 2 && N <= 5) {
                answer = "Not Weird";
            } else if (N % 2 == 0 && N >= 6 && N <= 20) {
                answer = "Weird";
            } else if (N % 2 == 0 && N > 20) {
                answer = "Not Weird";
            }
            System.out.println(answer);

        }
        catch (Exception e){
            System.out.println( e.getMessage());
        }
        finally{
            System.out.println("in finally");
            scanner.close();
        }
    }
}
