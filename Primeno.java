import java.util.Scanner;
public class Primeno
{
    public static void main(String[] args)
    {
        int i,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n=sc.nextInt();
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
               count++;
            }
            
        }
            if(count==1)
            {
                System.out.println("prime number");
            }
            else
            {
                System.out.println("not an prime number");
            }
        }
    }
