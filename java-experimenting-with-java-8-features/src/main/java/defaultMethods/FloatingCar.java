package defaultMethods;

public class FloatingCar implements Car {

    @Override
    public String drive() {
        return "Drive";
    }

    @Override
    public String sail() {
        return "Sail";
    }
}
