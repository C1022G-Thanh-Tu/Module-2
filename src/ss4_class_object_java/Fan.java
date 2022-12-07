package ss4_class_object_java;

public class Fan {
    final public int slow = 1;
    final public int medium = 2;
    final public int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Fan() {

    }

    public String toString() {
        if (this.isOn()) {
            return "Fan 1 có " + "Speed: " + this.getSpeed() + " .Color: " + this.getColor() +
                    " .Radius: " + this.getRadius() + " .Status: " + "fan is on - " + this.isOn();
        } else {
            return "Fan 2 có " + "Speed: " + this.getSpeed() + " .Color: " +this.getColor() +
                    " .Radius: " + this.getRadius() + " .Status: " + "fan is off - " + this.isOn();
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setOn(true);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setOn(false);
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }
}
