package defaultMethods;

public interface Car {

    public String drive();

    default public String sail() {
        return "Cannot sail";
    }

    public static String getName() {
        return "Car";
    }

}
