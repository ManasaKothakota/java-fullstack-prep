import java.util.*;

class BasicOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number :");
        int num2 = sc.nextInt();
        System.out.println("Addition of the number is :"+ (num1 + num2));
        System.out.println("Subraction of the number is :"+ (num1 - num2));
        System.out.println("Multiplication of the number is :"+ (num1 * num2));
        System.out.println("Division of the number is :"+ (num1 / num2));
        System.out.println("Modulous of the number is :"+ (num1 % num2));

    }
}