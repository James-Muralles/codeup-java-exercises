package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

        public String getArea(){
            return String.format("%.2f",length * width);
        }

    public String getPerimeter(){
        return String.format("%.2f",(2*length) + (2 * width));
    }



}
