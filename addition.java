import java.util.Scanner;

public class addition
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two no");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of the two no is "+sum);
    }
}