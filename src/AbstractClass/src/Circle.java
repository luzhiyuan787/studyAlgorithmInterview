package AbstractClass.src;

public class Circle extends Shape{
    private final double redius;
    public Circle(double redius){
        this.redius = redius;
    }

    @Override
    public double area() {
        return Math.PI * redius * redius;
    }
}
