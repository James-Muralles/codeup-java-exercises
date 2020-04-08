package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();//create new scanner
        Input input2 = new Input();
        Input input3 = new Input();
//        Circle a = new Circle(input.getDouble(1,100)); //create new circle and input radius

            System.out.println("Would you like to make a circle?");
        do {
            if(input2.yesNo()) {
                Circle b = new Circle(input.getDouble(1, 100));
                System.out.println("Area: " + b.getArea());
                System.out.println("Circumference: " + b.getCircumference());
                System.out.println("Created circles: " + Circle.circleCount);
                System.out.println("Want to make another circle?");
            }
            else{
             break;
            }

        } while (true);

//        System.out.println(a.getArea());
//        System.out.println(a.getCircumference());

    }
}
