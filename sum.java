import java.util.*;
public class sum {
public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(;n>0;n/=10)
        {
            sum+=n%10;
        }
        System.out.println("Sum of digits = "+sum);
        sc.close();
    }
    
}
