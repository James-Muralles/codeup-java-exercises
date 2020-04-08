package javareview;

import java.util.ArrayList;

public class Repairer extends Human {

    public Repairer(String name) {
        super(name);
    }

    public void repairComputer(ArrayList<Computer> thisStoresBrokenPile, ArrayList<Computer> thisStoresFixedPiles) {
        if (!thisStoresBrokenPile.isEmpty()) {
            Computer computerTobeFixed = thisStoresBrokenPile.get(0);
            while(computerTobeFixed.isBroken()){
                computerTobeFixed.turnOff();
                computerTobeFixed.turnOn();
            }
            thisStoresBrokenPile.remove(0);
            thisStoresFixedPiles.add(computerTobeFixed);
        } else {
            System.out.println("No computers to be fixed");
        }
    }
}
