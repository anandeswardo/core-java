import java.util.*;
public class Bigthree
{
public static void main()
{
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c)
System.out.println("a is big"+a);
else if(b>c)
System.out.println("b is big"+b);
else
System.out.println("c is big"+c);
}
}
