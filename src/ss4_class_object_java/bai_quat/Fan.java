package ss4_class_object_java;

public class Fan {
    final public int SLOW = 1;
    final public int MEDIUM = 2;
    final public int FAST = 3;
    private int speed = 1;
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

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
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
            return "Fan 2 có " + "Color: " +this.getColor() +
                    " .Radius: " + this.getRadius() + " .Status: " + "fan is off - " + this.isOn();
        }
    }
}