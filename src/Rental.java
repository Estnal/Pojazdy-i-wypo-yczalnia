public class Rental extends RentableCar {
    public Rental(String name, int yearBook, int numberOfSeats) {
        super(name, yearBook, numberOfSeats);
    }

    public static void main(String[] args) {
        Vehicle[] vehicles =  new Vehicle[2];
        vehicles[0] =  new Car("Audi", 2000, 5);
        vehicles[1] =  new Car("Seat", 2005, 6);
    }
}
