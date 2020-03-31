package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }
//    protected double length;
//    protected double width;
//
//    public double getLength() {
//        return length;
//    }
//    public void setLength(double length) {
//        this.length = length;
//    }
//    public double getWidth() {
//        return width;
//    }
//    public void setWidth(double width) {
//        this.width = width;
//    }
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//        public String getArea(){
//            return String.format("%.2f",length * width);
//        }
//    public String getPerimeter(){
//        return String.format("%.2f",(2*length) + (2 * width));
//    }


}
