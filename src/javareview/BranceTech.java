package javareview;

import java.util.ArrayList;

public class BranceTech {
        private static ArrayList<Computer> brokenComputers = new ArrayList<>();
        private static ArrayList<Computer> fixedComputers = new ArrayList<>();

        private static Clerk brance = new Clerk("Brance");
        private static Repairer johny = new Repairer("Johnny");

        public static void main(String[] args) {

            Computer testComputerOne = new Computer("Dell", false, true);
            Computer testComputerTwo = new Computer("Alienware", false, true);
            Computer testComputerThree = new Computer("Apple", false, true);

brance.recieveComputer(testComputerOne, brokenComputers);
brance.recieveComputer(testComputerTwo, brokenComputers);
brance.recieveComputer(testComputerThree, brokenComputers);

            for(Computer computer : brokenComputers){
                System.out.println("computer.getName() = " + computer.getName());
            }

            johny.repairComputer(brokenComputers, fixedComputers);
            johny.repairComputer(brokenComputers, fixedComputers);

            System.out.println("---------");
            for(Computer computer : brokenComputers){
                System.out.println("computer.getName() = " + computer.getName());
            }
            System.out.println("---------");
            for(Computer computer : fixedComputers){
                System.out.println("computer.getName() = " + computer.getName());
                System.out.println("computer.isBroken() = " + computer.isBroken());
            }




    }
}
