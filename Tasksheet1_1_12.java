
public class Tasksheet1_1_12 {
    
    public static void main(String[] args) {
        
        Circle circle = new Circle("Red",5.89);
        circle.display();
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("\n");
        Rectangle rectangle = new Rectangle("Blue",7.24, 9.38);
        rectangle.display();
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    
    }
    
}

interface Shape{
    double calculateArea();
    double calculatePerimeter();
    void display();
}

abstract class AbstractShape implements Shape{
    protected String color;
    protected double length;
    protected double width;
    protected double radius;
    
    public AbstractShape(){
        
    }
    
    public AbstractShape(String color){
        this.color = color;
    }
    
    public AbstractShape(String color, double length, double width){
        this.color = color;
   										 this.length = length;
    										this.width = width;
									}
    
    public AbstractShape(String color, double radius){
        this.color = color;
    										this.radius = radius;
									}
    
   public double calculateArea(){
        return length * width;
    }
    
    public double calculatePerimeter(){
        return 2 * (length * width);
    }
    
    public void display(){
        System.out.println("This is a color " + color + " Rectangle.");
    }
}

class Rectangle extends AbstractShape{
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
    										this.length = length;
    										this. width = width;
    }
    
    @Override public double calculateArea(){
        return length * width;
    }
    
    @Override public double calculatePerimeter(){
        return 2 * (length * width);
    }
    
    @Override public void display(){
        System.out.println("This is a color " + color + " Rectangle.");
    }
    
}


class Circle extends AbstractShape{
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
    										this.radius = radius;
    }
    
    @Override public double calculateArea(){
        return Math.PI * radius * radius;
    }
    
    @Override public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
    
    @Override public void display(){
        System.out.println("This is a color " + color + " Circle.");
    }
}