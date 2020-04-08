package javareview;

import java.util.ArrayList;

public class Clerk extends Human{

    public Clerk(String name) {
        super(name);
    }

    public void recieveComputer (Computer incomingBrokenComputer, ArrayList<Computer> thisStoresBrokenComputer){
        thisStoresBrokenComputer.add(incomingBrokenComputer);
    }
}
