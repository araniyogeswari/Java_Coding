import java.util.Scanner;
public class  Vote_Eligibility_Exceptions{
    public static void main(String[] args) {
    
   Scanner get = new Scanner(System.in);
    System.out.print("Enter the age:");
    int age=get.nextInt();
    if (age<18) 
    {   
        throw new ArithmeticException("Not Eligible to Vote");        
    }
    System.out.println("The Person Can Vote ");   

}
}
