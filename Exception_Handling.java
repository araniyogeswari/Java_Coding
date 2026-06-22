import java.util.Scanner;
public class Exception_Handling {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a num: ");
    int num1 = sc.nextInt();
    System.out.print("Enter a num:");
    int num2 = sc.nextInt();
    try
    {
    System.out.println("The Division value of numbers is :"+(num1/num2));
    }
    catch(ArithmeticException e){
        System.out.println("No Number can be divided by Zero");
        System.out.println("Enter a num");
        num1=sc.nextInt();
        System.out.println("Enter a num");
        num2 = sc.nextInt();
        System.out.println("The Division value of numbers is :"+(num1/num2));
    }
    finally
    {
        System.out.println("Program executed Succesfully");
    }
    }
}

