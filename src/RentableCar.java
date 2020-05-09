public class RentableCar extends Car implements Rentable {
    public RentableCar(String name, int yearBook, int numberOfSeats) {
        super(name, yearBook, numberOfSeats);
    }

    Person person;


    @Override
    public void rent(String firstName, String lastName, String id) {
        person = new Person();
        person.firstName = firstName;
        person.lastName = lastName;
        person.id = id;
    }

    @Override
    public void hangover() {
        person = null;
    }

    @Override
    public boolean isRent() {
        return person != null;
    }
    public String toString() {
        return "Samochód wypożyczony do " + person;
    }
}

