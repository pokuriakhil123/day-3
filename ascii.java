import java.util.Scanner;
public class ascii
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character ");
        char ch=sc.next().charAt(0);
        int v=ch;
        char c=(char)v;
        
        System.out.println(v);
        System.out.println(c);
    }
}