import java.util.*;
class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius of the circle is :");
        double radius = sc.nextDouble();
        double area = 3.14*radius*radius;
        System.out.println(" Area of circle is : "+ area);
    }
}