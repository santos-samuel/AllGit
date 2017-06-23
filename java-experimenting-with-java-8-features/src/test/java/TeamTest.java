import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import team.OriginalTeam;
import team.Person;
import team.Team;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class TeamTest {

    private Team team;

    public TeamTest(Team team) {
        this.team = team;
    }

    @Parameterized.Parameters(name = "{0}") // {0} = toString() of object
    public static java.util.Collection<Object[]> generateData() {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("aaa", new BigDecimal(1.1), "soccer", "jumping"));
        persons.add(new Person("bbbb", new BigDecimal(2.56), "running"));
        persons.add(new Person("cccc", new BigDecimal(2.91)));
        persons.add(new Person("ddddd", new BigDecimal(8.39), "flying", "running"));

        return Arrays.asList(new Object[][]{
                {new OriginalTeam(persons)},
                {new team.LambdaTeam(persons)},
        });
    }

    @Test
    public void print() {
        team.printAllPersons();
    }

    @Test
    public void shouldCountNumberOfPersonsWithHobby() {
        long personsWithHobby = team.countNumberOfPersonsWithAHobby();
        assertThat(personsWithHobby, equalTo(3l));
    }

    @Test
    public void shouldReturnNumberOfHobbies() {
        int totalNumberOfHobbies = team.countTotalNumberOfHobbies();
        assertThat(totalNumberOfHobbies, equalTo(5));
    }

    @Test
    public void shouldReturnPersonWithMostHobbies() {
        Person personWithMostHobbies = team.getPersonWithMostHobbies();
        assertThat(personWithMostHobbies.getName(), equalTo("aaa"));
    }

    @Test
    public void shouldReturnCorrectTotalMoneyAmount() {
        BigDecimal bigDecimal = team.countTotalMoneyAmount();
        assertThat(bigDecimal.compareTo(new BigDecimal(14.96)), equalTo(0));
    }

}
