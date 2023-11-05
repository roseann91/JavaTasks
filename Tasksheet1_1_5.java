
public class Tasksheet1_1_5 {
    
    public static void main(String[] args) {
        
        String str = "racecar";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        
        if(str.equals(rev)){
            System.out.println("The input string is a palindrome");
        }else{
            System.out.println("The input string is not a palindrome");
        }  
    }
    
}