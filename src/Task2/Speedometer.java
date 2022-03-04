package Task2;

public class Speedometer {
    static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        if (mountainBike.getSpeed() > roadBike.getSpeed()) {
            return Bike.MOUNTAIN;
        } else {
            return Bike.ROAD;
        }
    }

    static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed > roadBikeSpeed) {
            return Bike.MOUNTAIN;
        } else {
            return Bike.ROAD;
        }
    }
}
