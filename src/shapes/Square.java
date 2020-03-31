package shapes;

public class Square extends Quadrilateral {
//private double side;

    protected Square(double side) {
        super(side, side);
//        this.side = side;
    }

    @Override
    protected void setWidth(double width) {
        this.width = width;
//        this.side = width;
    }

    @Override
    protected void setLength(double length) {
        this.length = length;
//        this.side = length;

    }

    @Override
    public double getPerimeter() {
        return this.length *4;
//        return side *4;
    }

    @Override
    public double getArea() {
       return this.length * this.length;
//        return side * side;
    }


//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//        }
//
//    @Override
//    public String getArea() {
//        return String.format("override : %.2f",Math.pow(side, 2));
//    }
//
//    @Override
//    public String getPerimeter() {
//        return String.format("override: %.2f",side * 4);
//    }


}
