public interface Rentable {
    String rent(String firstName, String lastName, String id);
    String handOver();
    boolean isRent();

}
