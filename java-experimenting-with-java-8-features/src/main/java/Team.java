import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Team {
    protected List<Person> persons = new ArrayList<>();

    public Team(ArrayList<Person> persons) {
        this.persons = persons;
    }

    abstract public void printAllPersons();

    abstract public long countNumberOfPersonsWithAHobby();

    abstract public int countTotalNumberOfHobbies();

    abstract public Person getPersonWithMostHobbies();

    abstract public BigDecimal countTotalMoneyAmount();

    @Override
    public String toString() {
        return getClass().getName();
    }
}
