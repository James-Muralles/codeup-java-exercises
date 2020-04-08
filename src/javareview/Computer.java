package javareview;

public class Computer implements Electronic{
    private String name;
    private boolean isPowerOn;
    private boolean isBroken;

    public String getName() {
        return name;
    }

    public Computer(String newComputerName, boolean newComputerPowerStatus, boolean computerBrokenStatus){
        this.name = newComputerName;
        this.isPowerOn = newComputerPowerStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public boolean isBroken() {
        return isBroken;
    }

    @Override
    public void turnOn() {// implementing method from interface
        if ( this.isBroken && !this.isPowerOn){
            this.isPowerOn = true;
           int chanceToFix = (int) Math.floor(Math.random() * 5);
            if(chanceToFix == 2){
                this.isBroken = false;
            } else {
                this.isPowerOn = true;
            }
        }
    }

    @Override
    public void turnOff() {// implementing method from interface
        this.isPowerOn = false;

    }
}
