import java.util.Scanner;
public class palindom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int num=sc.nextInt();
        int rev=0;
        while (num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
        if(num==rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not pallidom");
        }
    }
}