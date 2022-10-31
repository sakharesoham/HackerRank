import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String answer="";
        if(N%2==1){
            answer="Weird";
        }else if(N%2==0 && N>=2 && N<=5){
            answer="Not Weird";
        }else if(N%2==0 && N>=6 && N<=20){
            answer="Weird";
        }else if(N%2==0 && N>20){
            answer="Not Weird";
        }
        System.out.println(answer);
        scanner.close();
    }
}
