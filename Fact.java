import java.util.*;
public class Fact
{
    public static void main(String[] args)
    {
     int f=1,i,num;
     Scanner sc=new Scanner(System.in);
     num=sc.nextInt();
     for (i=1;i<=num;i++)
     f=f*i;
     System.out.println(f);
}
}
