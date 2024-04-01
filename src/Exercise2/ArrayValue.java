package Exercise2;
import java.util.Random;
import java.util.Scanner;
public class ArrayValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] ranArray = new double[50];
        Random random = new Random();

        for (int i =0; i <ranArray.length; i++){
            ranArray[i] = random.nextInt();
        }

        do {
            try {
                System.out.println("Please enter a integer value between 0 and 49: ");
                int num = input.nextInt();
                System.out.println(ranArray[num]);
                System.out.println("///END OF PROGRAM///");
                break;
            } catch (Exception e) {
                System.out.println("Invalid, only integer values between 0 and 49 will be accepted: ");
                input.nextLine();
            }
        }while(true);
    }
}
