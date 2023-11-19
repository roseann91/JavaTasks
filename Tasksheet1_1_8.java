
public class Tasksheet1_1_8 {
    
    public static void main(String[] args) {
        System.out.println("Sum = " + sum(5,6,7));
        
    }
    
    static int sum(int param1, int param2, int param3) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for (int i = 1; i <= param1; i++) {
            sum1 += i;
        }
        
        for (int i = 1; i <= param2; i++) {
            sum1 += i;
        }
        
        for (int i = 1; i <= param3; i++) {
            sum1 += i;
        }
        
        sum = sum1 + sum2 + sum3;
        
        return sum;
    }
    
}