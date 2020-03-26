package shapes;

public class Circle {
    private double radius;
    public static long circleCount;

    public Circle() {
        System.out.println("here is a new circle");
        circleCount++;
    }

    public Circle(double radius) {
        this.radius = radius;
        circleCount++;
    }


    public String getArea() {
        return String.format("%.2f",2 * Math.PI * radius);
    }

    public String getCircumference() {
        return String.format("%.2f",Math.PI * Math.pow(radius, 2));
    }


}
