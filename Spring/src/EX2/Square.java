package EX2;

public class Square implements Shape {
    private double side;

    public Square() {}
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    public double calculateArea() {
        return side * side;
    }

    public void printShapeInfo() {
        System.out.println("Square: " + side + "^2 = " + calculateArea());
    }
}
