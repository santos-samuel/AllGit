package defaultMethods;

public interface Boat {

    default public String sail() {
        return "Sail";
    }
}
