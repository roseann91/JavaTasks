import java.util.Scanner;
public class Tasksheet1_1_6 {
    
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largestNum = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        num3 = sc.nextInt();
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 > num2 && num1 > num3) {
            largestNum = num1;
            System.out.println("Largest number: " + largestNum);
        } else if (num2 > num1 && num2 > num3) {
            largestNum = num2;
            System.out.println("Largest number: " + largestNum);
        } else if (num3 > num1 && num3 > num2) {
            largestNum = num3;
            System.out.println("Largest number: " + largestNum);
        } else {
            System.out.println("Invalid Input!");
        }
    }
    
}