import java.util.Scanner;
public class rev_factorial
{
    public static void main(String[] args)
    {
        int i,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n=sc.nextInt();
        for(f=1;n>=1;n--) 
        {
          f=f*n;
        }
        System.out.println(f);
    }
}