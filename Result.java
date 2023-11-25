
 import java.util.*;

 
public class Result {
    public static void main (String ar[]){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the  all subject mark  obataied out of 100 ");
        System.out.println("Enter the English subject mark");
        int English=sc.nextInt();

        System.out.println("Enter the Hindi subject mark");
        int Hindi = sc.nextInt();

        System.out.println("Enter the Chemistry subject mark");
        int Chemistry=sc.nextInt();

        System.out.println("Enter the Physicse subject mark");
        int Physicse=sc.nextInt();


        System.out.println("Enter the Biology subject mark");
        int Biology =sc.nextInt();
          
         int sum =( English + Hindi + Chemistry + Physicse + Biology);
 
         System.out.println("Total marks"+sum);
         
         double Avrage =sum /5;

         System.out.println("Avrage"+Avrage);


         double  Percentage =(Avrage/500)*100;

         System.out.println("The total avrage in percentage" + (double)Percentage );

        

    }
    
}
