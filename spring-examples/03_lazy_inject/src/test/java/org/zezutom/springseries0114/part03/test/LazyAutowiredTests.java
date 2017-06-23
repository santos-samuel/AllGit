package org.zezutom.springseries0114.part03.test;

import org.zezutom.springseries0114.part03.lazy.Car;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:spring-config.xml")
public class LazyAutowiredTests {

    @Qualifier(value = "lazyCar")
    @Autowired
    private Car car;

    private Profile profile = ProfileBuilder
            .newBuilder()
            .name("Spring logs")
            .filePath("target/spring.log").onLocalhost().build();

    @Test
    public void lazilyInjectedBeanIsNotPreloaded() {
        assertThat(executing(grep(regularExpression("Creating instance of bean(.*)lazySeat"), on(profile))).totalLines(), is(0));
    }

    @Test
    public void lazilyInjectedBeanIsAvailableWhenAskedFor() {
         assertNotNull(car.getDriver());
         assertNotNull(car.getPassenger());
    }

    @Test
    public void lazyAutowiredRespectsThePrototypeScope() {
         assertFalse(car.getDriver().equals(car.getPassenger()));
    }


}
