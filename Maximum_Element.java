import java.util.*;
public class Maximum_Element
{
  public static void main(String[] args)
  {
       
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[10];
       System.out.println("Enter elements in array");
      
       int max=Integer.MIN_VALUE;
       for(int i=0;i<=9;i++)
       {
         arr[i]=sc.nextInt();
         
         if(arr[i]>max)
         {
           max=arr[i];
         }
       }
       System.out.println("Maximum element is "+max); 
       
  }
}

