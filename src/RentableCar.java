public class RentableCar extends Car implements Rentable {
    public RentableCar(String name, int yearBook, int numberOfSeats) {
        super(name, yearBook, numberOfSeats);
    }

    @Override
    public String rent(String firstName, String lastName, String id) {
        return null;
    }

    @Override
    public String handOver() {
        return "Zawróc";
    }

    @Override
    public boolean isRent() {
        if (isRent()== true) {
            return true;
        }else{
            return false;
        }

    }


}
