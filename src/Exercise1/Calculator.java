package Exercise1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        do{
            try{
                System.out.println("Welcome to the Addition Calculator lets do Math! " + "\n" +
                        "Please enter 2 number one at a time: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                flag = false;
                int sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);
                System.out.println("Thank you for using! :-) ");
                System.out.println("///END OF PROGRAM///");
            } catch (Exception e){
                System.out.println("Invalid, type a integer \n");
                input.nextLine();
            }
        }while(flag);
    }
}