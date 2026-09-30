import java.util.Scanner;
public class reverse 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a =n;
       int rev=0;
       for(;n>0;n/=10){
        int d = n%10;
        rev=rev*10+d;
       }
       if(a==rev)
       System.out.println("No. is palindrome");
       else
       System.out.println("No. is not palindrome");
        sc.close();
    }
}
