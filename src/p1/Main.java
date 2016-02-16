package p1;

public class Main {

    public static void main(String[] args) {

        // Create an array of balloons
        Balloon[] things = new Balloon[5];

        // Create one balloon object
        things[0] = new Balloon();

        // Create another balloon object
        things[1] = new Balloon(12, "yellow");

        // Create another balloon object
        things[2] = new Balloon(6, "red");

        // Print the number of balloons made
        System.out.printf("We made %d balloons%n", Balloon.getQuantity());

        // Destroy the second balloon
        Balloon.destroy(1, things);

        // Print the number of balloons remaining
        System.out.printf("We have %d balloons%n", Balloon.getQuantity());
        // Print the balloons' characteristics

        for (Balloon each : things)
            // Don't print elements that are not defined
            if (each != null)
                System.out.println(each);
    }
}

class Balloon {
    private int size;
    private String color;
    private boolean inflated;
    private static int quantity = 0;

    // Default constructor
    Balloon() {

        size = 10;
        color = "orange";
        inflated = false;
        quantity++;
    }

    // Constructor receives size and color
    Balloon(int s, String c) {
        size = s;
        color = c;
        inflated = false;
        quantity++;
    }

    // Return the size
    int getSize() {
        return size;
    }

    // Return the color
    String getColor() {
        return color;
    }

    // Return the number of balloons made
    static int getQuantity() {
        return quantity;
    }

    // Destroy a balloon given the index value
    static void destroy(int i, Balloon[] arg) {
        quantity--;
        arg[i] = null;
    }

    // Return the inflation status
    public boolean isInflated() {
        return inflated;
    }

    // Set the inflation status
    public void setInflated(boolean arg) {
        inflated = arg;
    }

    // Provide a toString method

    @Override
    public String toString() {
        return "Balloon{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", " + (isInflated() ? " Inflated" : " Not Inflated") +
                '}';
    }
}

