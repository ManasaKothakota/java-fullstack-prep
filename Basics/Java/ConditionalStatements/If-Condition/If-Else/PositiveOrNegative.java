import java.util.*;
class PositiveOrNegative{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative number");
        }
    }
}