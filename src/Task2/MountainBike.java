package Task2;

public class MountainBike implements Bicycle {
    private int gear;
    private int speed;

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear != 1 && newGear != (-1)){
            System.out.println("Gears can only be changed by one at the time");
        }else if (gear+newGear < 0){
            System.out.println("Cannot lower the gear any lower!");
        }else if (gear+newGear>20){
            System.out.println("Cannot increase the gear any higher!");
        }else{
            this.gear = gear+newGear;
            System.out.println("Current gear: "+gear);
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0){
            System.out.println("Speed can only be increased with positive numbers");
        }else if (speed+increment > 100){
            System.out.println("Speed is too high, cannot be increased any more, maximum amount of speed increment is: "+(100-speed));
        }else {
            this.speed=speed+increment;
            System.out.println("Current speed: "+speed);
        }
    }

    @Override
    public void applyBrakes(int brakes) {
        if (speed-brakes < (-10)){
            System.out.println("Cannot apply more brakes, speed is too low, maximum amount of brakes are: " +(speed+10));
        }else if (brakes <0){
            System.out.println("Brake value cannot be negative!");
        }else {
            this.speed = speed-brakes;
            System.out.println("Current speed: "+speed);
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
