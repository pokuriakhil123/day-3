import java.util.Scanner;
public class factors
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n=sc.nextInt();
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+(" "));
            }
        }
    }
}