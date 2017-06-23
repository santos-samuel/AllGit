import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    private final String name;
    private final List<String> hobbies;
    private final BigDecimal money;

    public Person(String name, BigDecimal money, String... hobbies) {
        this.name = name;
        this.money = money;
        this.hobbies = new ArrayList<>();
        this.hobbies.addAll(Arrays.asList(hobbies));
    }

    public String getName() {
        return name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public int getHobbyCount() {
        return this.hobbies.size();
    }

    public boolean hasHobby(String hobby) {
        for (String h : this.hobbies) {
            if (h.equals(hobby)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
