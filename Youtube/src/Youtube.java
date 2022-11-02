import java.util.*;

public class Youtube{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*int centuries=Integer.parseInt(scan.nextLine());
        int years= centuries * 100;
        int days = years*365;
        int hours=24*days;
        int minutes=hours*60;

        System.out.printf("%d Centuries= %d years= %d days= %d hours= %d minutes",centuries,years,days,hours,minutes);*/

        /*String firstname=scan.nextLine();
        String lastname=scan.nextLine();
        String fullname=String.format("%s %s",firstname,lastname);

        System.out.printf("Your fullname is %s",fullname);*/

        /*String message="C:\\Windows";
        String formatted=message + " " + "world";
        System.out.println(formatted);*/

        int [] numbers=new int[]{42,112,13};
        for(int i=0;i<numbers.length;i++){
            System.out.printf(numbers[i]+" ");
        }
        System.out.println();
    }
}