import java.util.Scanner;
public class Tasksheet1_1_7 {
    
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = sc.nextDouble();
        
        System.out.println(num1 + " + " + num2 + "= " + add(num1, num2));
        System.out.println(num1 + " - " + num2 + "= " + subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + "= " + multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + "= " + divide(num1, num2));
    }
    
    static double add(double n1, double n2) {
        double output = n1 + n2;
        return output;
									}
        
    static double subtract(double n1, double n2) {
        double output = n1 - n2;
        return output;
									}
        
    static double multiply(double n1, double n2) {
        double output = n1 * n2;
        return output;
									}
        
    static double divide(double n1, double n2) {
        double output = n1 / n2;
        return output;
									}    
}