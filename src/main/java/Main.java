public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        return 0;
    }

    public static void main(String[] args) {
        var startPoint = new Point(10,20); // Exercise 1, Declaring a reference variable.
        
        System.out.println("Hello World!");

        System.out.println("x value is : " + startPoint.x);

        startPoint.move(5,-3);  //the move method in Point.java adds the new values
        // and changes the values of x and y

        startPoint.printState();  // Calling the printState method

    }

}
