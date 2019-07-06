import java.util.*;
public class Arm
{  
 public static void main(String args[])
 {  
  Scanner sc=new Scanner(System.in); 
  int r,sum=0,temp;    
  int n=sc.nextInt();
  temp=n;    
  while(n>0)
  {    
   r=n%10;    
   sum=sum+(r*r*r);    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("armstrong");    
  else    
   System.out.println("not armstrong");    
}  
}
