package org.zezutom.springseries0114.part02.test;

import org.zezutom.springseries0114.part02.AppConf;
import org.zezutom.springseries0114.part02.BeanLogger;

import java.util.Collection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConf.class)
public class LazinessTests {

    @Autowired
    private ApplicationContext context;

    @Autowired
    BeanLogger beanLogger;

    private Collection<String> beans;

    @Before
    public void setUp() {
        this.beans = beanLogger.getBeans();
    }

    @After
    public void cleanUp() {
        beanLogger.reload();
    }

    @Test
    public void initialLoadRespectsLaziness() {
        // beanA is lazy
        assertFalse(beans.contains("beanA"));

        // beanB was explicitly marked as non-lazy
        assertTrue(beans.contains("beanB"));

        // beanC is a singleton
        assertTrue(beans.contains("beanC"));

        // beanD is a prototype
        assertFalse(beans.contains("beanD"));

        // 'foo' is lazy but the eager 'bar' depends on it
        assertTrue(beans.contains("foo"));
        assertTrue(beans.contains("bar"));
    }

    @Test
    public void aLazyBeanIsInitializedOnRequest() {
        assertNotNull(context.getBean("beanA"));
        assertTrue(beans.contains("beanA"));
        assertTrue(beans.contains("beanD"));
    }

}
