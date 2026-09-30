import java.util.*;
public class array 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int s = a.length;
        for(int i=0;i<s;i++)
        a[i] = sc.nextInt();
        for(int i=0;i<s;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
    
}
