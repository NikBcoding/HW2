public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    //  Exercise 2
    public static void resetPoint(Point p) {
        System.out.println("Inside resetPoint, p start: ");
        p.printState();
        p.move(0, 0);  //  Affect original object
        p = new Point(0, 0);  // Does not affect original reference
        System.out.println("Inside resetPoint, p end: ");
        p.printState();
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        int sum = 0;
        for (Point p : points) {
            sum += p.x;
        }
        return sum;
    }

    public static void main(String[] args) {

        // Exercise 1
        Point startPoint = new Point(10,20);  // Exercise 1, Declaring, Instantiating, Initializing
        
        System.out.println("Hello World!");
        System.out.println("x value of startPoint.x: " + startPoint.x);  // Accessing object's x field directly and printing.
        startPoint.move(5,-3);  //the move method in Point.java adds the new values
        // and changes the values of x and y
        startPoint.printState();  // Calling the printState method from Point.java

        // Exercise 2
        int originalValue = 50;
        attemptToChangePrimitive(originalValue);  //calling method with the originalValue as the argument.
        System.out.println("Original value is: " + originalValue); // originalValue is unchanged because Java passes arguments by value.

        Point refPoint = new Point(5,10);
        System.out.println("Before resetPoint: ");
        resetPoint(refPoint);
        System.out.println("After resetPoint: ");
        refPoint.printState();

        // Exercise 3 test using the no-argument constructor, should output (0,0)
        Point defaultPoint = new Point();  // Calls Point(0)
        System.out.println("No-argument constructor result should be (0, 0): ");
        defaultPoint.printState();  // We expect Point coordinates (0,0)

        //Exercise 4 Inheritance test
        Microwave mw = new Microwave(800,30);

        // Exercise 5
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        Point p3 = new Point(5,6);
        int sum1 = sumCoordinates(p1,p2,p3);
        System.out.println("Sum of x-coordinates is: " + sum1);

        Point[] pointArray = {new Point(7,8), new Point(9,10)};
        int sum2 = sumCoordinates(pointArray);
        System.out.println("Sum from array: " + sum2);

        // Exercise 6
        mw.printDescription();

        // Exercise 7
        Device d1 = new Device(500);
        Microwave m1 = new Microwave(1000,120);
        Device polyDevice = m1;
        polyDevice.printDescription();  // Due to runtime polymorphism, Microwave's overridden method is called.

        // Exercise 8
        if (polyDevice instanceof Microwave) {
            Microwave mwRef = (Microwave) polyDevice;
            mwRef.heatFood();
        }
    }
}
