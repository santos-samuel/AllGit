import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

public class OriginalTeam extends Team {
    public OriginalTeam(ArrayList<Person> persons) {
        super(persons);
    }

    @Override
    public void printAllPersons() {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    @Override
    public long countNumberOfPersonsWithAHobby() {
        int personsWithHobby = 0;
        for (Person person : persons) {
            if (person.getHobbyCount() > 0) {
                personsWithHobby++;
            }
        }
        return personsWithHobby;
    }

    @Override
    public BigDecimal countTotalMoneyAmount() {
        BigDecimal totalMoneyAmount = new BigDecimal(0);
        for (Person person : persons) {
            totalMoneyAmount = totalMoneyAmount.add(person.getMoney());
        }
        return totalMoneyAmount;
    }

    @Override
    public int countTotalNumberOfHobbies() {
        int numberOfHobbies = 0;
        for (Person person : persons) {
            numberOfHobbies += person.getHobbyCount();
        }
        return numberOfHobbies;
    }

    @Override
    public Person getPersonWithMostHobbies() {
        Iterator<Person> iterator = persons.iterator();
        Person personWithMostHobbies = iterator.next();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getHobbyCount() > personWithMostHobbies.getHobbyCount()) {
                personWithMostHobbies = next;
            }
        }
        return personWithMostHobbies;
    }
}