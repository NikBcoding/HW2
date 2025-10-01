public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    public static void resetPoint(Point p) {
        System.out.println("Inside resetPoint, start: ");
        p.printState();
        p.move(0, 0);
        p = new Point(0, 0);
        System.out.println("Inside resetPoint, end: ");
        p.printState();
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        return 0;
    }

    public static void main(String[] args) {
        // Exercise 1
        var startPoint = new Point(10,20); // Exercise 1, Declaring a reference variable.
        
        System.out.println("Hello World!");
        System.out.println("x value is : " + startPoint.x);

        startPoint.move(5,-3);  //the move method in Point.java adds the new values
        // and changes the values of x and y

        startPoint.printState();  // Calling the printState method

        // Exercise 2
        int originalValue = 50;
        attemptToChangePrimitive(originalValue);  //calling method with the originalValue as the argument.
        System.out.println("Original value is: " + originalValue); // originalValue is unchanged because Java passes arguments by value.

        Point refPoint = new Point(5,10);
        System.out.println("Before resetPoint: ");
        refPoint.printState();
        System.out.println("After resetPoint: ");
        refPoint.printState();

        // Exercise 3 test using the no-argument constructor, should output (0,0)
        Point origin = new Point();  // Calls Point(0)
        System.out.println("No-argument constructor result should be (0, 0): ");
        origin.printState();  // We expect Point coordinates (0,0)

        //Exercise 4 Inheritance test
        Microwave mw = new Microwave(800,30);
        mw.model = "Panasonic Inverter";
        mw.printDescription();
    }
}
