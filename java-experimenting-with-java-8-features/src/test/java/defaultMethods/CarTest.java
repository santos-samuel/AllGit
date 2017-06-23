package defaultMethods;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;

public class CarTest {

    @Test
    public void testGetName() throws Exception {
        String name = Car.getName();
        Assert.assertThat(name, equalTo("Car"));
    }
}