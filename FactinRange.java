import java.util.*;
public class FactinRange
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int f=1,i,range1,range2;
        System.out.println("enter lower limit");
        range1=sc.nextInt();
        System.out.println("enter upper limit");
        range2=sc.nextInt();
        for(i=range1;i<=range2;i++)
        {
            for(int j=i;j<=i;j++)
            {
                f=f*j;
                System.out.println(f);
            }
        }
    }
}
