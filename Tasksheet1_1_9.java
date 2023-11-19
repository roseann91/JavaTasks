import static java.lang.Math.*;
public class Tasksheet1_1_9 {
    
    public static int add(int a, int b) {
        int output = Math.addExact(a, b);
        return output;
									}
        
    public static int subtract(int a, int b) {
        int output = Math.subtractExact(a, b);
        return output;
									}
        
    public static int multiply(int a, int b) {
        int output = Math.multiplyExact(a, b);
        return output;
									}
    public static int divide (int a, int b){
        int output = Math.floorDiv(a, b);
        return output;
									}    
    
    public static void main(String[] args) {
        int add = add(5, 7);
        int subtract = subtract(9, 4);
        int multiply = multiply(6, 3);
        int divide = divide(8, 2);
        
        System.out.println("5 + 7 = " + add);
        System.out.println("9 - 4 = " + subtract);
        System.out.println("6 * 3 = " + multiply);
        System.out.println("8 ÷ 2 = " + divide);
    }
    
}