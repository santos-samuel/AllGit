package defaultMethods;

public class BoatCar implements Car, Boat {

    @Override
    public String drive() {
        return null;
    }

    /**
     * Both Car and Boat have a default method called sail(). This means this class has to implement it's own version
     * of sail, or choose to use the implementation of Car or Boat.
     */
    @Override
    public String sail() {
        return Boat.super.sail();
    }
}
