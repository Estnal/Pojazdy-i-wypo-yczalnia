public class MotorBike extends Vehicle {
    private double speedLimit;

    public MotorBike(String name, int yearBook, double speedLimit) {
        super(name, yearBook);
        this.speedLimit = speedLimit;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }
}
