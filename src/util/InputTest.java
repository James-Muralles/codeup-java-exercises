package util;

import java.util.ArrayList;
import java.util.List;

public class InputTest {
    public static void main(String[] args) {
            Input yes = new Input();

//        System.out.println(yes.yesNo());
        System.out.println(yes.getInt(3,9));
//            System.out.println(yes.getDouble(3.4,7.8));
        System.out.println(yes.getInt());
        System.out.println(yes.getDouble());

//
    }
}