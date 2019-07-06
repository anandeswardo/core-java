import java.util.*;
public class BigofN
{
  public static void main(String[] args)
  {
   int large=0,num,n,i;
   System.out.println("enter the number");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   for(i=0;i<n;i++)
   {
    num=sc.nextInt();
    if(num>large)
    {
      large=num;
    }
   } 
  System.out.println("the largest is:"+large);
  }
}
