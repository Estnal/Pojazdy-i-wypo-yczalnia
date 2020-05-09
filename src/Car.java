public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String name, int yearBook, int numberOfSeats) {
        super(name, yearBook);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

}
