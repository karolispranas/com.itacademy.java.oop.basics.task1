package Task2;

public class RoadBike implements Bicycle {
    private int gear;
    private int speed;

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear != 1 && newGear != 2 && newGear != (-1) && newGear != (-2)) {
            System.out.println("Gears can only be changed by one or two at the time");
        } else if (gear + newGear < 0) {
            System.out.println("Gears cannot go bellow 0");
        } else if (gear + newGear > 10) {
            System.out.println("Gear cannot go higher than 10");
        } else {
            this.gear = gear + newGear;
            System.out.println("Current gear: " + gear);
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            System.out.println("Speed can only be increased with positive numbers");
        } else if (speed + increment > 50) {
            System.out.println("Speed is too high, cannot be increased any more, maximum amount of speed increment is: " + (50 - speed));
        } else {
            this.speed = speed + increment;
            System.out.println("Current speed: " + speed);
        }
    }

    @Override
    public void applyBrakes(int brakes) {
        if (speed + brakes < 0) {
            System.out.println("Too much brakes, road bikes cannot move backwards");
        } else if (brakes > 0) {
            System.out.println("Brakes can only be applied using negative values");
        } else {
            this.speed = speed + brakes;
            System.out.println("Current speed: " + speed);
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
