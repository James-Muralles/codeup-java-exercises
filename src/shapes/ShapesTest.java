package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Rectangle(40,50);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Square(4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
//        Rectangle box1 = new Rectangle(4.6,5.8);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getLength());
//        System.out.println(box1.getWidth());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getLength());
//        System.out.println(box2.getWidth());


    }
}
