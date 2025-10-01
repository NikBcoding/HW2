public class Microwave extends Device {
    private int maxCookingTime;

    public Microwave(int startPower, int maxCookingTime) {
        super(startPower);
        this.maxCookingTime = maxCookingTime;
        System.out.println("Microwave created");
    }
}
