import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d\n",s1,x);  //when we have to leave 15 character space for the string and 3 character space for the integer
        }
        System.out.println("================================");
    }
}