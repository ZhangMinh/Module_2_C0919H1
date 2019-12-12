import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

public class fan {
        final int SLOW =1;
        final int MEDIUM =2;
        final int FAST =3;
        private int speed=1;
        private boolean isOn=false;
        private String color="blue";
        private double radius=5;

    public fan() {
    }

    public fan(int speed, boolean isOn, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public fan(int speed, boolean isOn, String color, double radius) {
        this.speed = speed;
        this.isOn = isOn;
        this.color = color;
        this.radius = radius;
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

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "fan{" +
                "SLOW=" + SLOW +
                ", MEDIUM=" + MEDIUM +
                ", FAST=" + FAST +
                ", speed=" + speed +
                ", isOn=" + isOn +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
