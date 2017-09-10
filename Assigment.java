import java.util.Scanner;

public class Assigment
{
   public static void main(String args[])
   {
       String s1, s2;
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Give me a sentence : ");
       s1 = scan.nextLine();
       
       System.out.print("Original sentence : " +s1+ "\n");
       s2 = s1.replaceAll("[apAP]", ""); 
       System.out.print("Modified sentence : "+s2+"\n");
      
   }
}