import javax.xml.stream.XMLInputFactory;
import java.util.Scanner;

public class MethodsExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(addition(2, 3));
        System.out.println(subtraction(10, 6));
        System.out.println(multply(4, 9));
        System.out.println(div(8, 4));
        System.out.println(modulus(6, 3));
        System.out.println(getInt(0, 10));
    }

    public static int addition(int sum1, int sum2) {
        return sum1 + sum2;
    }

    public static int subtraction(int sum3, int sum4) {
        return sum3 - sum4;
    }

    public static int multply(int sum5, int sum6) {
        return sum5 * sum6;
    }

    public static int div(int sum7, int sum8) {
        return sum7 / sum8;
    }

    public static int modulus(int sum9, int sum10) {
        return sum9 % sum10;
    }

    public static int getInt(int min, int max) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number between " + min + " and " + max);

        if (sc.hasNextInt()) {
            int userNum = sc.nextInt();

            if (userNum >= min && userNum <= max) {
                return userNum;
            } else {
                System.out.println("Number out of range!");
                return getInt(min, max);
            }
        } else {
            System.out.println("Invalid input!");
            getInt(min, max);
        }
        return 0;
    }
        }

