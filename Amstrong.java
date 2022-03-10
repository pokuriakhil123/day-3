import java.util.Scanner;
class Amstrong
{
    public static void main(String[] args)
    {
        int d,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int n=sc.nextInt();
        d=n;
        while(d!=0)
        {
            temp=d%10;
            sum=sum+temp*temp*temp;
            d=d/10;
        }
        if(sum==n)
        {
            System.out.println(n+ " Amstrong");
        }
        else
        {
            System.out.println(n+ " not an Amstrong");
        }
    }
}