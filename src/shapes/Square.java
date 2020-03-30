package shapes;

public class Square extends Rectangle {


    public Square(double side) {
        super(side, side);
        }

    @Override
    public String getArea() {
        return String.format("override : %.2f",Math.pow(this.length, 2));
    }

    @Override
    public String getPerimeter() {
        return String.format("override: %.2f",this.length * 4);
    }


}
