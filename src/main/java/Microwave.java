public class Microwave extends Device {
    private int maxTime;

    // constructor with super() call
    public Microwave(int startPower, int maxCookingTime) {
        super(startPower);  // Call superclass constructor
        this.maxTime = maxCookingTime;

    }

    //  Exercise 6
    //  Override printDescription
    @Override
    public void printDescription() {
        super.printDescription();  // calling superclass method
        System.out.println("Max cooking time: " + maxTime + " seconds");
    }

    //  Exercise 8
    public void heatFood() {
        System.out.println("Food is heating up");
    }
}
