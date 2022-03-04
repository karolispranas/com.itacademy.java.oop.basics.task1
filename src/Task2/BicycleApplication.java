package Task2;

public class BicycleApplication {
    public static void main(String[] args) {
        Bicycle mountainBike = new MountainBike(0, 0);
        Bicycle roadBike = new RoadBike(0, 0);

        roadBike.speedUp(50);
        mountainBike.speedUp(100);
        roadBike.speedUp(50);
        mountainBike.speedUp(100);
        roadBike.speedUp(-100);
        mountainBike.speedUp(-200);
        roadBike.applyBrakes(-40);
        mountainBike.applyBrakes(40);
        roadBike.applyBrakes(-400);
        mountainBike.applyBrakes(100);
        roadBike.applyBrakes(40);
        mountainBike.applyBrakes(-40);
        roadBike.changeGear(1);
        mountainBike.changeGear(1);
        roadBike.changeGear(2);
        mountainBike.changeGear(2);

        System.out.println(Speedometer.chooseWinner((MountainBike) mountainBike, (RoadBike) roadBike));
        System.out.println(Speedometer.chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed()));
    }
}
