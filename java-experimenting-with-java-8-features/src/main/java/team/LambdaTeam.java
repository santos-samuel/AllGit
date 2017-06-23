package team;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class LambdaTeam extends Team {
    public LambdaTeam(ArrayList<Person> persons) {
        super(persons);
    }

    @Override
    public void printAllPersons() {

        persons.forEach(s -> System.out.println(s));
        // OR with method reference:
        persons.forEach(System.out::println);
    }

    @Override
    public long countNumberOfPersonsWithAHobby() {
        return persons.stream()
                .filter(person -> person.getHobbyCount() > 0)
                .count();
    }

    @Override
    public int countTotalNumberOfHobbies() {
        return persons.stream()
                .mapToInt(Person::getHobbyCount)
                .sum();
    }

    @Override
    public BigDecimal countTotalMoneyAmount() {
        return persons.stream()
                .map(Person::getMoney)
                .reduce((a, b) -> a.add(b))
                .get();
    }

    @Override
    public Person getPersonWithMostHobbies() {
        return persons.stream()
                .max(Comparator.comparing(Person::getHobbyCount))
                .get();
    }

}
