abstract public class Vehicle implements Moveable {
    private String name;
    private int yearBook;

    public Vehicle(String name, int yearBook) {
        this.name = name;
        this.yearBook = yearBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    @Override
    public String turnLeft() {
        return "Lewo";
    }

    @Override
    public String turnRight() {
        return "Prawo";
    }

    @Override
    public String goForward() {
        return "Naprzód";
    }

    @Override
    public String goBack() {
        return "W tył";
    }
}
