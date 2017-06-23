package org.zezutom.springseries0114.part02.test;

import org.zezutom.springseries0114.part02.primary.IOrdinal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class LazyVsPrimaryTests {

    @Autowired
    private IOrdinal ordinal;

    private Profile profile = ProfileBuilder
            .newBuilder()
            .name("Spring logs")
            .filePath("target/spring.log").onLocalhost().build();

    @Test
    public void theFirstIsUsedByDefault() {
        assertEquals("first", ordinal.count());
    }

    @Test
    public void theSecondIsPreloadedAlthoughItIsLazy() {
        assertThat(executing(grep(regularExpression("Creating instance of bean(.*)theSecond"), on(profile))).totalLines(), is(1));
    }

    @Test
    public void theThirdIsPreloadedAlthoughItIsPrototype() {
        assertThat(executing(grep(regularExpression("Creating instance of bean(.*)theThird"), on(profile))).totalLines(), is(1));
    }
}
